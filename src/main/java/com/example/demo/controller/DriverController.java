package com.example.demo.controller;


import com.example.demo.entity.Driver;
import com.example.demo.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("driver")
@RequiredArgsConstructor

public class DriverController {
    private final DriverService driverService;

    @PostMapping
    public void addDriver(@RequestParam String driverId, @RequestParam int age, @RequestParam String firstName, @RequestParam String sureName, @RequestParam String licencePlate) {
        driverService.addDriver(driverId, age, firstName, sureName, licencePlate);
    }

    @GetMapping("by-vehicle-type")
    public ResponseEntity<List<String>> findAllDriverByVehicleType(@RequestParam String type) {
        return ResponseEntity.ok(driverService.findAllDriverByVehicleType(type));
    }
}
