package com.example.demo.service;

import com.example.demo.entity.Equipment;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.EquipmentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.repository.VehicleRepository;

@Service
@Transactional
@RequiredArgsConstructor


public class EquipmentService {
    private final EquipmentRepository equipmentRepository;
    private final VehicleRepository vehicleRepository;
    @PersistenceContext
    EntityManager entityManager;

    public void addEquipment(int equipmentId, boolean hasTicketMachine, boolean hasWifi, boolean hasDigitalTracker, boolean hasLowFloor, String licencePlate) {
        entityManager.createNativeQuery("INSERT into equipment VALUES (?,?,?,?,?,?)")
                .setParameter(1,equipmentId)
                .setParameter(2,hasTicketMachine)
                .setParameter(3,hasWifi)
                .setParameter(4,hasDigitalTracker)
                .setParameter(5,hasLowFloor)
                .setParameter(6,licencePlate)
                .executeUpdate();
    }
    public void deleteEquipmentById(int equipmentId){
        entityManager.createNativeQuery("DELETE FROM equipment WHERE equipment_id=?").setParameter(1,equipmentId).executeUpdate();
    }
}
