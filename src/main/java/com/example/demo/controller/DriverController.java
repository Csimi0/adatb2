package com.example.demo.controller;


import com.example.demo.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("driver")
@RequiredArgsConstructor

public class DriverController {
    private final DriverService driverService;

    @PostMapping
    public void addDriver(@RequestParam String driverId, @RequestParam int age, @RequestParam String firstName, @RequestParam String sureName, @RequestParam String licencePlate) {
        driverService.addDriver(driverId, age, firstName, sureName, licencePlate);
    }
    @PatchMapping
    public void updateDriver(@RequestParam String driverId, @RequestParam(required = false) Integer age, @RequestParam(required = false) String firstName, @RequestParam(required = false) String sureName, @RequestParam(required = false) String licencePlate){
        driverService.updateDriverById(driverId, age, firstName, sureName, licencePlate);
    }

    @GetMapping("by-vehicle-type")
    public List<String> findAllDriverByVehicleType(@RequestParam String type) {
        return driverService.findAllDriverByVehicleType(type);
    }
    @DeleteMapping
    public void deleteDriverById(@RequestParam String driverId){
        driverService.deleteDriverById(driverId);
    }
    @GetMapping("by-SZJA")
    public List<String> findAllSZJACompatibleDriver() {
        return driverService.findAllSZJACompatibleDriver();
    }


}
