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
                        "  VALUES ('3',true,false,'Fecske utca','16:10:10','16:10:10') on duplicate key update station_id = '3'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('4',false,false,'Sándor utca','16:14:00','16:14:05') on duplicate key update station_id = '4'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('5',true,false,'Szt Istvan Tér','16:16:00','16:16:05') on duplicate key update station_id = '5'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('6',true,false,'Dugonics tér','16:18:00','16:18:05') on duplicate key update station_id = '6'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('7',true,false,'Klinikák','16:20:05','16:21:05') on duplicate key update station_id = '7'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('8',true,false,'Makkosház','16:10:05','16:10:05') on duplicate key update station_id = '8'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('9',true,false,'Gét utca','16:15:05','16:15:05') on duplicate key update station_id = '9'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('10',true,false,'Diófa vendéglő','16:18:05','16:18:05') on duplicate key update station_id = '10'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('11',true,false,'Rózsa utca','16:20:05','16:21:05') on duplicate key update station_id = '11'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('12',true,false,'Berlini krt','16:25:05','16:26:05') on duplicate key update station_id = '12'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('13',true,false,'Hétvezér utca','16:30:05','16:31:05') on duplicate key update station_id = '13'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('14',true,false,'Mars Tér','16:35:05','16:36:05') on duplicate key update station_id = '14'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('15',true,false,'Széchenyi Tér','16:40:05','16:41:05') on duplicate key update station_id = '15'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('16',true,false,'Múzeum','16:45:05','16:46:05') on duplicate key update station_id = '16'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('17',true,false,'Körtöltés utca','10:10:05','10:12:05') on duplicate key update station_id = '17'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('18',false,false,'Rókusi viztorony','10:15:05','10:12:05') on duplicate key update station_id = '18'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('19',false,false,'Hétvezér utca','10:20:05','16:22:05') on duplicate key update station_id = '19'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('20',false,false,'Béke utca','10:25:05','16:27:05') on duplicate key update station_id = '20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('21',true,false,'Petőfi utca','10:30:05','16:32:05') on duplicate key update station_id = '21'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('22',true,false,'Rókusi iskola','10:35:05','16:37:05') on duplicate key update station_id = '22'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('23',true,false,'Gyermekkorház','10:40:05','16:42:05') on duplicate key update station_id = '23'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('24',true,false,'Aradi tér','10:45:05','10:46:05') on duplicate key update station_id = '24'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('25',true,false,'Csillagtér','10:50:05','10:51:05') on duplicate key update station_id = '25'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('26',true,false,'Tarján','12:50:05','12:51:05') on duplicate key update station_id = '26'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('27',false,false,'Budapesti körút','12:55:05','12:56:05') on duplicate key update station_id = '27'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('28',false,false,'Deák F Gimn','13:00:05','13:01:05') on duplicate key update station_id = '28'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('29',false,false,'Kecskeméti út','13:05:05','13:06:05') on duplicate key update station_id = '29'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('30',false,false,'Szt györgy tér','13:10:05','12:12:05') on duplicate key update station_id = '30'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('31',false,false,'Anna kút','13:15:05','13:16:05') on duplicate key update station_id = '31'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('32',false,false,'Károlyi u','13:20:05','12:21:05') on duplicate key update station_id = '32'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('3',false,false,'Londoni krt','13:25:05','13:26:05') on duplicate key update station_id = '33'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('34',false,false,'Veresács u','13:30:05','13:31:05') on duplicate key update station_id = '34'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into station(station_id,is_end_station,is_start_station,name,arrival,departure)" +
                        "  VALUES ('35',false,false,'Kálvária','13:35:05','13:36:05') on duplicate key update station_id = '35'")
                .executeUpdate();


    }
    public void createRouteData(){
        entityManager.createNativeQuery(" INSERT INTO route VALUES('1') on duplicate key update route_id = '1'")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT INTO route VALUES('2') on duplicate key update route_id = '2'")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT INTO route VALUES('3') on duplicate key update route_id = '3'")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT INTO route VALUES('4') on duplicate key update route_id = '4'")
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
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('1','4') on duplicate key update route_route_id = '1'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('1','5') on duplicate key update route_route_id = '1'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('1','6') on duplicate key update route_route_id = '1'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('1','7') on duplicate key update route_route_id = '1'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','8') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','9') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','10') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','11') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','12') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','13') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','14') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','15') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('2','16') on duplicate key update route_route_id = '2'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','17') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','18') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','19') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','20') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','21') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','22') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','23') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','24') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('3','25') on duplicate key update route_route_id = '3'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','26') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','27') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','28') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','29') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','30') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','31') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','32') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','33') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','34') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();
        entityManager.createNativeQuery(" INSERT IGNORE INTO route_stations   " +
                        "VALUES('4','35') on duplicate key update route_route_id = '4'; ")
                .executeUpdate();

    }
    public void createEquipmentData(){
        entityManager.createNativeQuery("INSERT into equipment VALUES ('1',true,true,true,true) on duplicate key update equipment_id = '1'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('2',true,true,true,false) on duplicate key update equipment_id = '2'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('3',true,true,false,false) on duplicate key update equipment_id = '3'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('4',true,false,false,false) on duplicate key update equipment_id = '4'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('5',false,false,false,false) on duplicate key update equipment_id = '5'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('6',true,false,true,true) on duplicate key update equipment_id = '6'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('7',true,false,false,true) on duplicate key update equipment_id = '7'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('8',true,false,false,false) on duplicate key update equipment_id = '8'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('9',true,false,true,false) on duplicate key update equipment_id = '9'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into equipment VALUES ('10',true,true,false,false) on duplicate key update equipment_id = '10'")
                .executeUpdate();

    }
    public void createVehicleData(){
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('RGB-123','Busz','1','8') on duplicate key update licence_plate = 'RGB-123'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('LST-123','Villamos','2','9') on duplicate key update licence_plate = 'LST-123'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('ABC-562','Villamos','4','10') on duplicate key update licence_plate = 'ABC-562'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('ADC-621','Busz','2','7') on duplicate key update licence_plate = 'ADC-621'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('AEC-762','Villamos','4','6') on duplicate key update licence_plate = 'AEC-762'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('ATZ-542','Busz','2','5') on duplicate key update licence_plate = 'ATZ-542'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('VRT-215','Villamos','4','4') on duplicate key update licence_plate = 'VRT-215'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('TZS-783','Busz','1','3') on duplicate key update licence_plate = 'TZS-783'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into vehicle VALUES ('GTS-592','Busz','3','2') on duplicate key update licence_plate = 'GTS-592'")
                .executeUpdate();
    }
    public void createDriverData(){
        entityManager.createNativeQuery("INSERT into driver VALUES ('55RA87','19','Pisti','Kis','RGB-123') on duplicate key update driver_id = '55RA87'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55GB17','30','Csanád','Csúfos','RGB-123') on duplicate key update driver_id = '55GB17'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55MV20','20','Béla','Nagy','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55GS20','21','András','Nagy','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('52ZT20','22','István','Budai','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('SHSSR20','23','Imre','Nagy','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('UZST20','24','Ábel','Somogyi','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('25HZ20','25','Peti','Tér','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55JU20','26','Donát','Deák','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('35GS20','27','Peti','Szűcs','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55SAS20','40','Bence','Nagy','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('45DRS20','41','Zsolti','Práth','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55HZS20','42','Márk','Vincze','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();
        entityManager.createNativeQuery("INSERT into driver VALUES ('55SATR','44','Bendeguz','Fodor','LST-123') on duplicate key update driver_id = '55MV20'")
                .executeUpdate();

    }

}
