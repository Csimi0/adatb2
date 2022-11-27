package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Table(name = "driver")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@OnDelete(action = OnDeleteAction.CASCADE)
public class Driver {
    @Id
    private String driverId;
    private int age;
    private String sureName;
    private String firstName;
    @OneToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Vehicle vehicle;
}
