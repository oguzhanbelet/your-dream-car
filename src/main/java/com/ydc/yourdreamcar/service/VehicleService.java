package com.ydc.yourdreamcar.service;

import com.ydc.yourdreamcar.entity.Vehicle;

public interface VehicleService {

    Vehicle getVehicle(String id);
    String addVehicle(Vehicle vehicle);
}
