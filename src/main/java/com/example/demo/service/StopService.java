package com.example.demo.service;

import com.example.demo.entity.Station;
import com.example.demo.entity.Stop;
import com.example.demo.repository.StationRepository;
import com.example.demo.repository.StopRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
@Transactional
@RequiredArgsConstructor
public class StopService {
    private final StopRepository stopRepository;
    private final StationRepository stationRepository;

    public void addStop(int stopId, Time arrival, Time departure, int stationId){
        Station station = stationRepository.findById(stationId).orElseThrow(RuntimeException::new);
        Stop stop = new Stop(stopId,arrival,departure,station);
        stopRepository.save(stop);
    }
}
