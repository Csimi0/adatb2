package com.example.demo.service;

import com.example.demo.entity.Station;
import com.example.demo.repository.StationRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.sql.Time;
import java.util.List;

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
    public void updateStationById(int stationId, Boolean isEndStation, Boolean isStartStation , String name, Time arrival,Time departure){
        entityManager.createNativeQuery("UPDATE station SET  is_end_station = IFNULL(?,is_end_station),is_start_station = IFNULL(?,is_start_station), name = IFNULL(?,name),arrival = IFNULL(?,arrival),departure = IFNULL(?,departure) WHERE station_id = ? ")
                .setParameter(1,isEndStation)
                .setParameter(2,isStartStation)
                .setParameter(3,name)
                .setParameter(4,arrival)
                .setParameter(5,departure)
                .setParameter(6,stationId)
                .executeUpdate();
    }
    public void deleteStationById(int stationId){
        entityManager.createNativeQuery("DELETE FROM route_stations WHERE stations_station_id = ?").setParameter(1,stationId).executeUpdate();
        entityManager.createNativeQuery("DELETE FROM station WHERE station_id=?").setParameter(1,stationId).executeUpdate();
    }
    public List<Station> basicSelectStation(){
        return stationRepository.selectAllStation();
    }
}
