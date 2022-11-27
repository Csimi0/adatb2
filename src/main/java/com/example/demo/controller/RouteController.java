package com.example.demo.controller;

import com.example.demo.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
}
