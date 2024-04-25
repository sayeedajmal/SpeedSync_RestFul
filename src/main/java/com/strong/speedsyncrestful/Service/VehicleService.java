package com.strong.speedsyncrestful.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strong.speedsyncrestful.Entity.Vehicle;
import com.strong.speedsyncrestful.Repository.VehicleRepo;

import lombok.NonNull;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    public void regVehicle(@NonNull Vehicle vehicle) {
        vehicle.setTimestamp(System.currentTimeMillis());
        vehicleRepo.save(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicleRepo.findAll();
    }
}
