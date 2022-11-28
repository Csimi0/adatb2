package com.example.demo.util;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("data-gen")
@RequiredArgsConstructor
public class DataGenController {
   private final DataGenService dataGenService;

   @GetMapping
    public ModelAndView dataGen(){
       dataGenService.createStationData();
       dataGenService.createRouteData();
       dataGenService.createRouteStationData();
       dataGenService.createEquipmentData();
       dataGenService.createVehicleData();
       dataGenService.createDriverData();
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("drivers.html");
       return modelAndView;

   }
}
