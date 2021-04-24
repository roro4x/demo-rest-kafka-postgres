package com.example.demo.model.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="car_id_seq")
    @SequenceGenerator(name="car_id_seq", sequenceName="car_id_seq", allocationSize=10)
    private Long id;
    private String brand;
    private String model;
    private String vin;
}
