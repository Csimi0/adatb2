package com.example.demo.service;

import com.example.demo.entity.Station;
import com.example.demo.repository.StationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Time;

@Service
@Transactional
@RequiredArgsConstructor

public class StationService {
    private final StationRepository stationRepository;

    public void addStation(int stationId, boolean isEndStation, boolean isStartStation , String name, Time arrival,Time departure){
        Station station = new Station(stationId,isEndStation, isStartStation,name,arrival,departure);
        stationRepository.save(station);

    }
}
