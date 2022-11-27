package com.example.demo.controller;

import com.example.demo.entity.Station;
import com.example.demo.service.RouteService;
import com.example.demo.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Time;
import java.util.List;

@RestController
@RequestMapping("stations")
@RequiredArgsConstructor
public class StationController {
    private final StationService stationService;
    private final RouteService routeService;

    @PostMapping
    public void addStation(@RequestParam int stationId,@RequestParam int isEndStation,@RequestParam int isStartStation,@RequestParam String name,@RequestParam(required = false)  Time arrival,@RequestParam(required = false)  Time departure){
        stationService.addStation(stationId, isEndStation,isStartStation,name,arrival,departure);
    }
    @PatchMapping
    public void updateStation(@RequestParam int stationId,@RequestParam(required = false) Boolean isEndStation,@RequestParam(required = false) Boolean isStartStation,@RequestParam(required = false) String name,@RequestParam(required = false)  Time arrival,@RequestParam(required = false)  Time departure){
            stationService.updateStationById(stationId, isEndStation, isStartStation, name, arrival,departure);
    }

    @DeleteMapping
    public void deleteStationById(@RequestParam int stationId){
        stationService.deleteStationById(stationId);
    }

    @GetMapping
    public ModelAndView selectStation(Model model){
        model.addAttribute("stations",stationService.basicSelectStation());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("stations.html");
        return modelAndView;

    }
//    @RestController
//    public class MyRestController {
//        @RequestMapping("/")
//        public ModelAndView welcome() {
//            ModelAndView modelAndView = new ModelAndView();
//            modelAndView.setViewName("login.html");
//            return modelAndView;
//        }
//    }
}
