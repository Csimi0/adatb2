package com.example.demo.service;

import com.example.demo.entity.Route;
import com.example.demo.entity.Station;
import com.example.demo.entity.Stop;
import com.example.demo.repository.RouteRepository;
import com.example.demo.repository.StationRepository;
import com.example.demo.repository.StopRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor

public class RouteService {
    private final RouteRepository routeRepository;
    private final StationRepository stationRepository;
    private final StopRepository stopRepository;

    public void addRoute(int routeId, int endStationId, int startStationId, List<Integer> stopId){
        Station endStation = stationRepository.findById(endStationId).orElseThrow(RuntimeException::new);
        Station startStation = stationRepository.findById(startStationId).orElseThrow(RuntimeException::new);
        List<Stop> stop = stopRepository.findAllById(stopId);
        Route route = new Route(routeId,endStation,startStation,stop);
        routeRepository.save(route);
    }

}
