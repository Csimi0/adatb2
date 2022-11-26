package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "driver")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    @Id
    private String driverId;
    private int age;
    private String sureName;
    private String firstName;
    @OneToOne
    private Vehicle vehicle;
}
