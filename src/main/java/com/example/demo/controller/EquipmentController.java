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
                             @RequestParam boolean hasLowFloor,
                             @RequestParam String licencePlate) {
        equipmentService.addEquipment(equipmentId, hasTicketMachine, hasWifi, hasDigitalTracker, hasLowFloor, licencePlate);
    }
    @PatchMapping
    public void updateDriver(@RequestParam int equipmentId,
                             @RequestParam(required = false) boolean hasTicketMachine,
                             @RequestParam(required = false) boolean hasWifi,
                             @RequestParam(required = false) boolean hasDigitalTracker,
                             @RequestParam(required = false) boolean hasLowFloor,
                             @RequestParam(required = false) String licencePlate){
        equipmentService.updateEquipmentById(equipmentId, hasTicketMachine, hasWifi, hasDigitalTracker,hasLowFloor, licencePlate);
    }

    @DeleteMapping
    public void deleteEquipmentById(@RequestParam int equipmentId) {
        equipmentService.deleteEquipmentById(equipmentId);
    }
}
