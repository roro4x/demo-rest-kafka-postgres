package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "deal")
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int signed;
    private int value;
    private String currency;
    @Transient
    private Price price;

    public Deal() {

    }

    public Deal(int signed, Price price) {
        this.signed = signed;
        this.value = price.getValue();
        this.currency = price.getCurrency();
    }

    public void setId(int id) { this.id = id; }

    public int getSigned() {
        return signed;
    }

    public void setSigned(int signed) {
        this.signed = signed;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
