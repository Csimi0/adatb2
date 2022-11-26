package com.example.demo.entity;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    private String driverId;
    private String age;
    private Name name;
    @OneToOne
    private Vehicle vehicle;
}
