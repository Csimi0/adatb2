package com.example.demo.service;

import com.example.demo.entity.Station;
import com.example.demo.repository.StationRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.Time;

@Service
@Transactional
@RequiredArgsConstructor

public class StationService {
    private final StationRepository stationRepository;
    @PersistenceContext
    EntityManager entityManager;


    public void addStation(int stationId, int isEndStation, int isStartStation , String name, Time arrival,Time departure){
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)  VALUES (?,?,?,?,?,?)")
                .setParameter(1,stationId)
                .setParameter(2,isEndStation)
                .setParameter(3,isStartStation)
                .setParameter(4,name)
                .setParameter(5,arrival)
                .setParameter(6,departure)
                .executeUpdate();
    }
    public void deleteStationById(int stationId){
        entityManager.createNativeQuery("DELETE FROM station WHERE station_id=?").setParameter(1,stationId).executeUpdate();
    }
}
