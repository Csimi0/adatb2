package com.example.demo.service;

import com.example.demo.repository.RouteRepository;
import com.example.demo.repository.StationRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor

public class RouteService {
    private final RouteRepository routeRepository;
    private final StationRepository stationRepository;
    @PersistenceContext
    EntityManager entityManager;

    public void addRoute(String routeId){
        entityManager.createNativeQuery(" INSERT INTO route VALUES(?) on duplicate key update route_id = ?")
                .setParameter(1,routeId)
                .setParameter(2,routeId)
                .executeUpdate();
    }
    public void addRouteStations(String routeId, String stationId){
        addRoute(routeId);
        entityManager.createNativeQuery(" INSERT INTO route_stations VALUES(?,?) on duplicate key update route_route_id = ?; ")
                .setParameter(1,routeId)
                .setParameter(2,stationId)
                .setParameter(3,routeId)
                .executeUpdate();
    }
    public void updateRouteStationsById(String routeId, String stationId,String updatedStationId){
        entityManager.createNativeQuery("UPDATE route_stations SET stations_station_id = IFNULL(?,stations_station_id) WHERE route_route_id = ? AND stations_station_id = ? ")
                .setParameter(1,updatedStationId)
                .setParameter(2,routeId)
                .setParameter(3,stationId)
                .executeUpdate();
    }
    public void deleteRouteById(int routeId){
        entityManager.createNativeQuery("DELETE FROM route WHERE route_id = (?)").setParameter(1,routeId).executeUpdate();
    }

    public int findCountStationForRoute(int routeId){
        return routeRepository.findCountStationForRoute(routeId);
    }

    public Integer countRouteWithWifi(Boolean hasWifi){
        return routeRepository.countRouteWithWifi(hasWifi);
    }
}
