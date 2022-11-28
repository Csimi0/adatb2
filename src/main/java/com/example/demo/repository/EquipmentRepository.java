package com.example.demo.repository;

import com.example.demo.entity.Equipment;
import com.example.demo.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

    @Query(value = "Select * From equipment",nativeQuery = true)
    List<Equipment> selectAll();
}
