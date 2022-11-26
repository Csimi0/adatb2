package com.example.demo.controller;

import com.example.demo.service.DriverService;
import com.example.demo.service.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("equipment")
@RequiredArgsConstructor
public class EquipmentController {
    private final EquipmentService equipmentService;
    @PostMapping
    public void addEquipment(@RequestParam int equipmentId,
                             @RequestParam boolean hasTicketMachine,
                             @RequestParam boolean hasWifi,
                             @RequestParam boolean hasDigitalTracker,
                             @RequestParam boolean hasLowFloor,
                             @RequestParam String licencePlate){
        equipmentService.addEquipment(equipmentId,hasTicketMachine,hasWifi,hasDigitalTracker,hasLowFloor,licencePlate);
    }
}
