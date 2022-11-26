package com.example.demo.entity;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stop {
    private Time arrival;
    private Time departure;
    @OneToOne
    private Station station;
}
