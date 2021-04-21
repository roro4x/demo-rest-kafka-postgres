package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String brand;
    private String model;
    private String vin;

    public Car() {

    }

    public Car(String brand, String model, String vin) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

}
