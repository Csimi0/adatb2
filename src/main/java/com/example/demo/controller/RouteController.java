package com.example.demo.controller;

import com.example.demo.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("route")
@RequiredArgsConstructor
public class RouteController {
    private final RouteService routeService;

    @PostMapping
    public void addRoute(@RequestParam String routeId,
                         @RequestParam String stationId){
        routeService.addRouteStations(routeId,stationId);
    }
    @PatchMapping
    public void updateRouteStation(@RequestParam String routeId,
                                   @RequestParam String stationId,
                                   @RequestParam String updatedStationId){
        routeService.updateRouteStationsById(routeId, stationId, updatedStationId);
    }
    @DeleteMapping
    public void deleteRouteById(@RequestParam int routeId){
        routeService.deleteRouteById(routeId);
    }

    @GetMapping("count-stations")
    public ModelAndView findCountStationForRoute(Model model){
        model.addAttribute("stations",routeService.findCountStationForRoute());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("countstations.html");
        return modelAndView;

    }

    @GetMapping("count-vehicle-with-wifi")
    public ModelAndView countRouteWithWifi(Model model){
        model.addAttribute("stations",routeService.countRouteWithWifi());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("countVehicleWithWifi.html");
        return modelAndView;

    }
}
