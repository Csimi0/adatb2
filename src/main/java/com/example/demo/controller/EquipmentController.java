package com.example.demo.controller;

import com.example.demo.service.DriverService;
import com.example.demo.service.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
                             @RequestParam boolean hasLowFloor) {
        equipmentService.addEquipment(equipmentId, hasTicketMachine, hasWifi, hasDigitalTracker, hasLowFloor);
    }
    @PatchMapping
    public void updateDriver(@RequestParam int equipmentId,
                             @RequestParam(required = false) boolean hasTicketMachine,
                             @RequestParam(required = false) boolean hasWifi,
                             @RequestParam(required = false) boolean hasDigitalTracker,
                             @RequestParam(required = false) boolean hasLowFloor){
        equipmentService.updateEquipmentById(equipmentId, hasTicketMachine, hasWifi, hasDigitalTracker,hasLowFloor);
    }

    @DeleteMapping
    public void deleteEquipmentById(@RequestParam int equipmentId) {
        equipmentService.deleteEquipmentById(equipmentId);
    }
}
