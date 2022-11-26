package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Service {
    @Id
    private int equipmentId;
    private boolean hasTicketMachine;
    private boolean hasWifi;
    private boolean hasDigitalTracker;
    private boolean hasLowFloor;
    @ManyToOne
    private Vehicle vehicle;

}
