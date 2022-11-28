package com.example.demo.controller;

import com.example.demo.service.DriverService;
import com.example.demo.service.EquipmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("equipments")
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
    @PostMapping("/update")
    public void updateDriver(@RequestParam int equipmentId,
                             @RequestParam(required = false) boolean hasTicketMachine,
                             @RequestParam(required = false) boolean hasWifi,
                             @RequestParam(required = false) boolean hasDigitalTracker,
                             @RequestParam(required = false) boolean hasLowFloor){
        equipmentService.updateEquipmentById(equipmentId, hasTicketMachine, hasWifi, hasDigitalTracker,hasLowFloor);
    }

    @GetMapping("/delete")
    public void deleteEquipmentById(@RequestParam String equipmentId) {
        equipmentService.deleteEquipmentById(equipmentId);
    }
    @GetMapping
    public ModelAndView selectAll(Model model){
        model.addAttribute("equipments",equipmentService.selectAll());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("equipments.html");
        return modelAndView;
    }
}
