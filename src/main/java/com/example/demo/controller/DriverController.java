package com.example.demo.controller;


import com.example.demo.entity.Driver;
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
    public void addDriver(@RequestParam String driverId, @RequestParam int age, @RequestParam String firstname, @RequestParam String surname, @RequestParam String licencePlate) {
        driverService.addDriver(driverId, age, firstname, surname, licencePlate);
    }

    @GetMapping("by-vehicle-type")
    public List<String> findAllDriverByVehicleType(@RequestParam String type) {
        return driverService.findAllDriverByVehicleType(type);
    }
}
