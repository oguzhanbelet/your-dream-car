package com.ydc.yourdreamcar.repository;

import com.ydc.yourdreamcar.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    Vehicle getVehicleByName(String name);
}
