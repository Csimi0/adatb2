package com.example.demo.service;

import com.example.demo.entity.Driver;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.DriverRepository;
import com.example.demo.repository.VehicleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
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
    @PersistenceContext
    EntityManager entityManager;
    public void addDriver(String driverId, int age, String firstName, String sureName, String licencePlate)  {
        entityManager.createNativeQuery("INSERT into driver VALUES (?,?,?,?,?)")
                .setParameter(1,driverId)
                .setParameter(2,age)
                .setParameter(3,firstName)
                .setParameter(4,sureName)
                .setParameter(5,licencePlate)
                .executeUpdate();
    }
    public void deleteDriverById(String driverId){
        entityManager.createNativeQuery("DELETE FROM driver WHERE driver_id=?").setParameter(1,driverId).executeUpdate();
    }
    public List<String> findAllDriverByVehicleType(String type){
       return driverRepository.findAllDriverByVehicleType(type);
    }

}
