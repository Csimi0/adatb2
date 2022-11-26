package com.example.demo.controller;

import com.example.demo.repository.StopRepository;
import com.example.demo.service.StopService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;

@RestController
@RequestMapping("stop")
@RequiredArgsConstructor

public class StopController {
    private final StopService stopService;

    @PostMapping
    public void addStop(@RequestParam int stopId,
                        @RequestParam Time arrival,
                        @RequestParam Time departure,
                        @RequestParam int stationId){
        stopService.addStop(stopId,arrival,departure,stationId);
    }
}
