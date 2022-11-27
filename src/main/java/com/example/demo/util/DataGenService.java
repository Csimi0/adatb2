package com.example.demo.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor

public class DataGenService {
    @PersistenceContext
    EntityManager entityManager;

    public void createStationData(){
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('1',false,true,'Viztorony','16:05:05','16:05:05') on duplicate key update station_id = '1'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('2',false,false,'Csillagtér','16:08:08','16:08:08') on duplicate key update station_id = '2'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('3',true,false,'Klinikák','16:20:05','16:20:05') on duplicate key update station_id = '3'")
                .executeUpdate();

    }
    public void createRouteData(){
        entityManager.createNativeQuery(" INSERT INTO route VALUES('1') on duplicate key update route_id = '1'")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT INTO route VALUES('2') on duplicate key update route_id = '2'")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT INTO route VALUES('3') on duplicate key update route_id = '3'")
                .executeUpdate();
    }
    public void createRouteStationData(){
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('1','1') on duplicate key update route_route_id = '1'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('1','2') on duplicate key update route_route_id = '1'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('1','3') on duplicate key update route_route_id = '1'; ")
                .executeUpdate();
    }
    public void createEquipmentData(){
        entityManager.createNativeQuery("INSERT into equipment VALUES ('1',true,true,true,true) on duplicate key update equipment_id = '1'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('2',true,true,true,false) on duplicate key update equipment_id = '2'")
                .executeUpdate();
    }
    public void createVehicleData(){
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('RGB-123','Troli','1','1') on duplicate key update licence_plate = 'RGB-123'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('LST-123','Villamos','1','2') on duplicate key update licence_plate = 'LST-123'")
                .executeUpdate();
    }
    public void createDriverData(){
        entityManager.createNativeQuery("INSERT into driver VALUES ('55RA87','19','Pisti','Kis','RGB-123') on duplicate key update driver_id = '55RA87'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55GB17','30','Csanád','Csúfos','RGB-123') on duplicate key update driver_id = '55GB17'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55MV20','35','Peti','Nagy','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
    }

}
