package com.example.demo.repository;

import com.example.demo.entity.Driver;
import com.example.demo.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

  /*  @Query(value = "INSERT into vehicle VALUES ('asd143','auto','2')",nativeQuery = true)
    Integer insertIntoVehicle();
*/
    @Query(value = "Select * From station",nativeQuery = true)
    List<Station> selectAllStation();

}
