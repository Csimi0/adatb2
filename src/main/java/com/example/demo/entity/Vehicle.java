package com.example.demo.entity;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private String licencePlate;
    private String type;
    @OneToMany
    private Route route;

}
