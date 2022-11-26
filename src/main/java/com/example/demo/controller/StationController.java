package com.example.demo.controller;

import com.example.demo.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;

@RestController
@RequestMapping("station")
@RequiredArgsConstructor
public class StationController {
    private final StationService stationService;

    @PostMapping
    public void addStation(@RequestParam int stationId,@RequestParam boolean isEndStation,@RequestParam boolean isStartStation,@RequestParam String name,@RequestParam Time arrival,@RequestParam Time departure){
        stationService.addStation(stationId, isEndStation,isStartStation,name,arrival,departure);

    }

}
