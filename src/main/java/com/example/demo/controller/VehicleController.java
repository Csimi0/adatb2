package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.DriverService;
import com.example.demo.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("vehicle")
@RequiredArgsConstructor

public class VehicleController {
    private final VehicleService vehicleService;
    @PostMapping
    public void addVehicle(@RequestParam String licencePlate,@RequestParam String type, @RequestParam(required = false) String routeId ){
        vehicleService.addVehicle(licencePlate,type,routeId);
    }
}