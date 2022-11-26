package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor

public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public void addVehicle(String licencePlate, String type, String routeId){

        Vehicle vehicle = new Vehicle(licencePlate,type,null);
        vehicleRepository.save(vehicle);

    }
}
