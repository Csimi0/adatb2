package com.example.demo.service;

import com.example.demo.entity.Station;
import com.example.demo.repository.StationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor

public class StationService {
    private final StationRepository stationRepository;

    public void addStation(int stationId,String name){
        Station station = new Station(stationId,name);
        stationRepository.save(station);

    }
}
