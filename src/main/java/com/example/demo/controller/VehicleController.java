package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.DriverService;
import com.example.demo.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("vehicles")
@RequiredArgsConstructor

public class VehicleController {
    private final VehicleService vehicleService;
    @PostMapping
    public void addVehicle(@RequestParam String licencePlate,@RequestParam String type, @RequestParam(required = false) Integer routeId,@RequestParam(required = false) Integer equipmentId ){
        vehicleService.addVehicle(licencePlate,type,routeId,equipmentId);
    }
    @PostMapping("/update")
    public void updateVehicle(@RequestParam String licencePlate,@RequestParam(required = false) String type, @RequestParam(required = false) String routeId,@RequestParam(required = false) int equipmentId ){
        vehicleService.updateVehicleById(licencePlate, type, routeId,equipmentId);
    }
    @GetMapping("/delete")
    public void deleteVehicleById(@RequestParam String licencePlate){
        vehicleService.deleteVehicleById(licencePlate);
    }
    @GetMapping
    public ModelAndView selectAll(Model model){
        model.addAttribute("vehicles",vehicleService.selectAll());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("vehicles.html");
        return modelAndView;
    }
}

