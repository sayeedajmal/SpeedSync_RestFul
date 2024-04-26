package com.strong.speedsyncrestful.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strong.speedsyncrestful.Entity.Vehicle;
import com.strong.speedsyncrestful.Exception.SpeedSyncException;
import com.strong.speedsyncrestful.Service.VehicleService;

@RestController
@RequestMapping("api/v1/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("challan")
    public ResponseEntity<Void> generateChallan(@RequestBody Vehicle vehicle) throws SpeedSyncException {
        vehicleService.challanSave(vehicle);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
