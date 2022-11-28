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

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor


public class EquipmentService {
    private final EquipmentRepository equipmentRepository;
    private final VehicleRepository vehicleRepository;
    @PersistenceContext
    EntityManager entityManager;

    public void addEquipment(int equipmentId, boolean hasTicketMachine, boolean hasWifi, boolean hasDigitalTracker, boolean hasLowFloor) {
        entityManager.createNativeQuery("INSERT into equipment VALUES (?,?,?,?,?)")
                .setParameter(1,equipmentId)
                .setParameter(2,hasTicketMachine)
                .setParameter(3,hasWifi)
                .setParameter(4,hasDigitalTracker)
                .setParameter(5,hasLowFloor)
                .executeUpdate();
    }
    public void updateEquipmentById(int equipmentId, boolean hasTicketMachine, boolean hasWifi, boolean hasDigitalTracker, boolean hasLowFloor){
        entityManager.createNativeQuery("UPDATE equipment SET has_digital_tracker = IFNULL(?,has_digital_tracker),has_low_floor = IFNULL(?,has_low_floor),has_ticket_machine = IFNULL(?,has_ticket_machine),has_wifi = IFNULL(?,has_wifi) WHERE equipment_id = ? ")
                .setParameter(1,hasDigitalTracker)
                .setParameter(2,hasLowFloor)
                .setParameter(3,hasTicketMachine)
                .setParameter(4,hasWifi)
                .setParameter(5,equipmentId)
                .executeUpdate();
        //a vehicle licence plate nem megy
    }
    public void deleteEquipmentById(String equipmentId){
        entityManager.createNativeQuery("DELETE FROM equipment WHERE equipment_id=?").setParameter(1,equipmentId).executeUpdate();
    }
    public List<Equipment> selectAll(){
        return equipmentRepository.selectAll();
    }
}
