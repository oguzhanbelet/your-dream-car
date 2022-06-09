package com.ydc.yourdreamcar.entity;

import com.redis.om.spring.annotations.Document;
import com.redis.om.spring.annotations.Indexed;
import com.ydc.yourdreamcar.entity.enums.Color;
import com.ydc.yourdreamcar.entity.enums.Fuel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@NoArgsConstructor
@Document
public class Vehicle {
    @Id
    @Indexed
    private String id;
    @Indexed
    private String name;
    @Indexed
    private Color color;
    @Indexed
    private Fuel fuel;
}
