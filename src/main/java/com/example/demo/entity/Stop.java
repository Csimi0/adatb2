package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stop {
    @Id
    private int stopId;
    private Time arrival;
    private Time departure;
    @OneToOne
    private Station station;
}
