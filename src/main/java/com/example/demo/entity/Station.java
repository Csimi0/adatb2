package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Station {
    @Id
    private int stationId;
    private boolean isEndStation;
    private boolean isStartStation;
    private String name;
    private Time arrival;
    private Time departure;
}
