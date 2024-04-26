package com.strong.speedsyncrestful.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strong.speedsyncrestful.Entity.Vehicle;
import com.strong.speedsyncrestful.Exception.SpeedSyncException;
import com.strong.speedsyncrestful.Repository.VehicleRepo;

import lombok.NonNull;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;

    public void challanSave(@NonNull Vehicle vehicle) throws SpeedSyncException {
        vehicle.setTimestamp(System.currentTimeMillis());
        try {
            vehicleRepo.save(vehicle);
        } catch (Exception ex) {
            throw new SpeedSyncException("Failed to Generate Challan: " + ex.getMessage());
        }
    }

}
