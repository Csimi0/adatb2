package com.example.demo.controller;

import com.example.demo.service.RouteService;
import com.example.demo.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("routes")
@RequiredArgsConstructor
public class RouteController {
    private final RouteService routeService;
    private final StationService stationService;

    @PostMapping
    public void addRoute(@RequestParam String routeId,
                         @RequestParam String stationId){
        routeService.addRouteStations(routeId,stationId);
    }
    @PostMapping("/update")
    public void updateRouteStation(@RequestParam String routeId,
                                   @RequestParam String stationId,
                                   @RequestParam String updatedStationId){
        routeService.updateRouteStationsById(routeId, stationId, updatedStationId);
    }
    @GetMapping("/delete")
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
    @GetMapping
    public ModelAndView selectAll(Model model){
        model.addAttribute("routeWithStations",routeService.selectAll());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("routes.html");
        return modelAndView;
    }
}
