package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor

public class VehicleService {
    @PersistenceContext
    EntityManager entityManager;
    public void addVehicle(String licencePlate, String type, String routeId){

        entityManager.createNativeQuery("INSERT into vehicle VALUES (?,?,?)")
                .setParameter(1,licencePlate)
                .setParameter(2,type)
                .setParameter(3,routeId)
                .executeUpdate();
    }
    public void updateVehicleById(String licencePlate, String type, String routeId){
        entityManager.createNativeQuery("UPDATE vehicle SET  type = IFNULL(?,type),route_route_id = IFNULL(?,route_route_id) WHERE licence_plate = ? ")
                .setParameter(1,type)
                .setParameter(2,routeId)
                .setParameter(3,licencePlate)
                .executeUpdate();
    }
    public void deleteVehicleById(String licencePlate){
        entityManager.createNativeQuery("DELETE FROM vehicle WHERE licence_plate=?").setParameter(1,licencePlate).executeUpdate();
    }
}
