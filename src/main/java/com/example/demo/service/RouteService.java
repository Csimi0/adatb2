package com.example.demo.service;

import com.example.demo.entity.Route;
import com.example.demo.entity.Station;
import com.example.demo.repository.RouteRepository;
import com.example.demo.repository.StationRepository;
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


    public void addRoute(int routeId, List<Integer> stations){
        List<Station> station = stationRepository.findAllById(stations);

        Route route = new Route(routeId,station);
        routeRepository.save(route);
    }

}
