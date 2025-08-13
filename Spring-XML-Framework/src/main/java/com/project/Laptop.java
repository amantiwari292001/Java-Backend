package com.project;

public class Laptop implements Computer {
    private int price;
    private String brand;
    public Laptop(int price, String brand){
        this.price = price;
        this.brand = brand;
        System.out.println("Laptop Created");
    }

    @Override
    public void run(){
        System.out.println("Laptop runs");
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
