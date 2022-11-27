package com.example.demo.repository;

import com.example.demo.entity.Driver;
import com.example.demo.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer>{
    @Query(value ="SELECT COUNT(stations_station_id) " +
            " FROM route_stations " +
            " where route_route_id = ? " +
            " group by route_route_id ",nativeQuery = true)
    int findCountStationForRoute(int routeId);

    @Query(value="Select COUNT(route_id) " +
            "from route " +
            "left join vehicle v on route.route_id = v.route_route_id "+
            "LEFT JOIN equipment e on v.licence_plate = e.vehicle_licence_plate " +
            "WHERE e.has_wifi = ? " +
            "GROUP BY route_id",nativeQuery = true)
    Integer countRouteWithWifi(Boolean hasWifi);
}
