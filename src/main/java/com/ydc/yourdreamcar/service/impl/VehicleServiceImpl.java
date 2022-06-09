package com.ydc.yourdreamcar.service.impl;

import com.ydc.yourdreamcar.entity.Vehicle;
import com.ydc.yourdreamcar.repository.VehicleRepository;
import com.ydc.yourdreamcar.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle getVehicle(String id) {
        return vehicleRepository.findById(id).orElse(new Vehicle());
    }

    @Override
    public String addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle).getId();
    }
}
