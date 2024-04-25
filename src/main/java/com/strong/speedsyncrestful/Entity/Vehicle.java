package com.strong.speedsyncrestful.Entity;

import java.util.Map;

import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Vehicle {

    @Indexed(direction = IndexDirection.ASCENDING)
    private String carNumber;
    private Map<String, Object> vehicleDetails;
    private Location location;
    private int currentSpeed;
    private String highway;

    private long timestamp;

}
