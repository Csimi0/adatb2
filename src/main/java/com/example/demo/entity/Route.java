package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    @Id
    private int routeId;
    @ManyToOne
    private Station end;
    @ManyToOne
    private Station start;
    @ManyToMany
    private List<Station> stations;

}
