package com.api.parkingcontrol.repositorie;

import com.api.parkingcontrol.model.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

boolean existsByLicensePlateCar(String licensePlateCar);
boolean existsByParkingSpotNumber(String licensePlateCar);
boolean existsByApartmentAndBlock(String licensePlateCar, String block);

}
