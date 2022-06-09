package com.ydc.yourdreamcar.repository;

import com.redis.om.spring.repository.RedisDocumentRepository;
import com.ydc.yourdreamcar.entity.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends RedisDocumentRepository<Vehicle, String> {
    Vehicle getVehicleByName(String name);
}
