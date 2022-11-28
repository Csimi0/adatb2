package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@OnDelete(action = OnDeleteAction.CASCADE)
public class Vehicle {
    @Id
    private String licencePlate;
    private String type;
    @ManyToOne
    private Route route;
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Equipment equipment;

}
