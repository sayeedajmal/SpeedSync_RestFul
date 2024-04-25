package com.strong.speedsyncrestful.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.strong.speedsyncrestful.Entity.Vehicle;

@Repository
public interface VehicleRepo extends MongoRepository<Vehicle, String> {

}