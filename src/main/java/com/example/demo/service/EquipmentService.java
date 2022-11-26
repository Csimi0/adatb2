package com.example.demo.service;

import com.example.demo.entity.Equipment;
import com.example.demo.entity.Vehicle;
import com.example.demo.repository.EquipmentRepository;
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

    public void addEquipment(int equipmentId,
                             boolean hasTicketMachine,
                             boolean hasWifi,
                             boolean hasDigitalTracker,
                             boolean hasLowFloor,
                             String licencePlate){
        Vehicle vehicle = vehicleRepository.findById(licencePlate).orElseThrow(RuntimeException::new);
        Equipment equipment = new Equipment(equipmentId,hasTicketMachine,hasWifi,hasDigitalTracker,hasLowFloor,vehicle);
        equipmentRepository.save(equipment);
    }
}
