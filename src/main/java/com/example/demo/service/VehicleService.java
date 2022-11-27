package com.example.demo.service;

import com.example.demo.entity.Driver;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor

public class VehicleService {
    private final VehicleRepository vehicleRepository;
    @PersistenceContext
    EntityManager entityManager;
    public void addVehicle(String licencePlate, String type, String routeId,int equipmentId){

        entityManager.createNativeQuery("INSERT into vehicle VALUES (?,?,?,?)")
                .setParameter(1,licencePlate)
                .setParameter(2,type)
                .setParameter(3,routeId)
                .setParameter(4,equipmentId)
                .executeUpdate();
    }
    public void updateVehicleById(String licencePlate, String type, String routeId,int equipmentId){
        entityManager.createNativeQuery("UPDATE vehicle SET  type = IFNULL(?,type),route_route_id = IFNULL(?,route_route_id),equipment_equipment_id = IFNULL(?,equipment_equipment_id) WHERE licence_plate = ? ")
                .setParameter(1,type)
                .setParameter(2,routeId)
                .setParameter(3,equipmentId)
                .setParameter(4,licencePlate)
                .executeUpdate();
    }
    public void deleteVehicleById(String licencePlate){
        entityManager.createNativeQuery("DELETE FROM vehicle WHERE licence_plate=?").setParameter(1,licencePlate).executeUpdate();
    }
    public List<Vehicle> selectAll(){
        return vehicleRepository.selectAll();
    }
}
