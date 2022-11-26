package com.example.demo.repository;

import com.example.demo.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, String> {
    @Query(value = "SELECT CONCAT(driver.sureName, ' ', driver.firstName )" +
            "FROM Driver driver " +
            "LEFT JOIN driver.vehicle vehicle " +
            "WHERE vehicle.type =:type")
    List<String> findAllDriverByVehicleType(String type);


}
