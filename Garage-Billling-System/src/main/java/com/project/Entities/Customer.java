package com.project.Entities;

public class Customer {
    private String name;
    private String phone;
    private Car carDetails;
    public Customer(String name, String phone, Car carDetails){
        this.name = name;
        this.phone = phone;
        this.carDetails = carDetails;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Car getCarDetails() {
        return carDetails;
    }
}
