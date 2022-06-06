package com.ydc.yourdreamcar.controller;

import com.ydc.yourdreamcar.entity.Vehicle;
import com.ydc.yourdreamcar.service.VehicleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    @GetMapping("/getVehicleById")
    public Vehicle getVehicleById(@RequestParam String name){
        return vehicleService.getVehicle(name);
    }
}
