package com.example.demo.repository;

import com.example.demo.entity.Driver;
import com.example.demo.entity.Vehicle;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends CrudRepository<Driver, String> {
    @Query(value = "SELECT CONCAT(driver.sureName, ' ' , driver.firstName)  " +
            "from Driver driver " +
            "JOIN driver.vehicle vehicle " +
            "WHERE vehicle.type =:type")
    List<String> findAllDriverByVehicleType(String type);


}
