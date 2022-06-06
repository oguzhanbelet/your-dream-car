package com.ydc.yourdreamcar.entity;

import com.ydc.yourdreamcar.entity.enums.Color;
import com.ydc.yourdreamcar.entity.enums.Fuel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Color color;
    private Fuel fuel;

    @ManyToOne
    private Brand brand;
}
