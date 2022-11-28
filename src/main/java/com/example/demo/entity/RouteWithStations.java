package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.sql.Time;
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class RouteWithStations {
    private Integer routeId;
    private Integer stationId;
    private Boolean isEndStation;
    private Boolean isStartStation;
    private String name;
    private Time arrival;
    private Time departure;

}
