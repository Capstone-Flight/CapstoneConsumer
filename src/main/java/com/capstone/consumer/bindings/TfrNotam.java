package com.capstone.consumer.bindings;

import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TfrNotam {
    @NotEmpty
    private String notamNumber;
    @NotEmpty
    private String notamType;

    // stores standard degrees longitude first then latitude after.
    List<Double> latlong;

    // Radius is in meters
    private double radius;

    private String startTime;

    private String endTime;

    // Required to deserialize a serialized object
    public TfrNotam() {
        super();
    }

    public TfrNotam(String notamNumber, String notamType, List<Double> latlong, double radius, String startTime, String endTime){
        this.notamNumber = notamNumber;
        this.notamType = notamType;
        this.latlong = latlong;
        this.radius = radius;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}