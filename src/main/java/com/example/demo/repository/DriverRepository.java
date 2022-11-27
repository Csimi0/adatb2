package com.example.demo.repository;

import com.example.demo.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {
    @Query(value = "SELECT CONCAT(driver.sure_name,' ',driver.first_name) FROM driver LEFT JOIN vehicle ON driver.vehicle_licence_plate = vehicle.licence_plate WHERE vehicle.type = 'Busz'",nativeQuery = true)
    List<String> findAllDriverByVehicleType();

    @Query(value = "SELECT CONCAT(driver.sure_name,' ',driver.first_name) " +
            "FROM driver " +
            "WHERE driver_id = ANY " +
            "      (SELECT driver_id " +
            "       FROM driver " +
            "       WHERE driver.age < 26)",nativeQuery = true)
    List<String> findAllSZJACompatibleDriver();
}

