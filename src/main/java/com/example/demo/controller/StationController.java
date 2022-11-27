package com.example.demo.controller;

import com.example.demo.service.StationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;

@RestController
@RequestMapping("station")
@RequiredArgsConstructor
public class StationController {
    private final StationService stationService;

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
}
