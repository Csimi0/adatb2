package com.example.demo.repository;

import com.example.demo.entity.Station;
import com.example.demo.entity.Vehicle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VehicleRepository extends CrudRepository<Vehicle,String> {

    @Query(value = "Select * From vehicle",nativeQuery = true)
    List<Vehicle> selectAll();
}
