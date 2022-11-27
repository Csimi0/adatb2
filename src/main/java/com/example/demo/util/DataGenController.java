package com.example.demo.util;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("data-gen")
@RequiredArgsConstructor
public class DataGenController {
   private final DataGenService dataGenService;

   @PostMapping
    public void dataGen(){
       dataGenService.createStationData();
       dataGenService.createRouteData();
       dataGenService.createRouteStationData();
      dataGenService.createEquipmentData();
       dataGenService.createVehicleData();
       dataGenService.createDriverData();

   }
}
