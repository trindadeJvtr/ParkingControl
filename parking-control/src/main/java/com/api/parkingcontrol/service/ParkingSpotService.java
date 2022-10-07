package com.api.parkingcontrol.service;

import com.api.parkingcontrol.repositorie.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ParkingSpotService {
    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
