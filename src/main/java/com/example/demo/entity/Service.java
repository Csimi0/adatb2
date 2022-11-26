package com.example.demo.entity;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    private int equipmentId;
    private boolean hasTicketMachine;
    private boolean hasWifi;
    private boolean hasDigitalTracker;
    private boolean hasLowFloor;
    @OneToMany
    private Vehicle vehicle;

}
