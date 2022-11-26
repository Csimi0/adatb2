package com.example.demo.service;

import com.example.demo.entity.Driver;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.DriverRepository;
import com.example.demo.repository.VehicleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Service
@Transactional
@RequiredArgsConstructor


public class DriverService {
    private final VehicleRepository vehicleRepository;
    private final DriverRepository driverRepository;
    public void addDriver(String driverId, int age, String firstName, String sureName, String licencePlate)  {
        Vehicle vehicle = vehicleRepository.findById(licencePlate).orElseThrow(RuntimeException::new);
        Driver driver = new Driver(driverId,age,firstName,sureName,vehicle);
        driverRepository.save(driver);
    }
    public List<String> findAllDriverByVehicleType(String type){
       return driverRepository.findAllDriverByVehicleType(type);
    }

}
