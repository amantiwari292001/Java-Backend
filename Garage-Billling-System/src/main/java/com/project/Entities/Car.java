package com.project.Entities;

public class Car {
    private String brand;
    private String number;
    public Car(String brand, String number){
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public String getNumber() {
        return number;
    }
}
