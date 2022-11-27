package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor


public class Equipment {
    @Id
    private int equipmentId;
    private boolean hasTicketMachine;
    private boolean hasWifi;
    private boolean hasDigitalTracker;
    private boolean hasLowFloor;
}
