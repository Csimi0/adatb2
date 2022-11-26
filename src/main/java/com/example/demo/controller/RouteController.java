package com.example.demo.controller;

import com.example.demo.service.RouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("route")
@RequiredArgsConstructor
public class RouteController {
    private final RouteService routeService;

    @PostMapping
    public void addRoute(@RequestParam int routeId,
                         @RequestParam int endStationId,
                         @RequestParam int startStationId,
                         @RequestParam List<Integer> stopId){
        routeService.addRoute(routeId,endStationId,startStationId,stopId);
    }
}
