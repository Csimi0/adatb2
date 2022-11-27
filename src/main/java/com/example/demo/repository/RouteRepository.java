package com.example.demo.repository;

import com.example.demo.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer>{
    @Query(value ="SELECT COUNT(stations_station_id) " +
            " FROM route_stations " +
            " where route_route_id = '1' " +
            " group by route_route_id ",nativeQuery = true)
    int findCountStationForRoute();

    @Query(value="SELECT COUNT(v.licence_plate)\n" +
            "FROM route\n" +
            "LEFT JOIN vehicle v on route.route_id = v.route_route_id\n" +
            "Left Join equipment e on e.equipment_id = v.equipment_equipment_id\n" +
            "WHERE e.has_wifi = true\n" +
            "GROUP BY v.equipment_equipment_id",nativeQuery = true)
    Integer countVehicleWithWifi();
}
