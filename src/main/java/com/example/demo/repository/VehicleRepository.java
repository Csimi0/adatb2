package com.example.demo.repository;

import com.example.demo.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehicleRepository extends CrudRepository<Vehicle,String> {

}
