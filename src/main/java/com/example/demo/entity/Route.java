package com.example.demo.entity;

import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    private int routeId;
    @OneToMany
    private Station end;
    @OneToMany
    private Station start;
    @OneToMany
    private List<Stop> stop;

}
