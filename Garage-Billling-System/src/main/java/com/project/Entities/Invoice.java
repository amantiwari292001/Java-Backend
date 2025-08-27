package com.project.Entities;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> serviceList = new ArrayList<>();
    private double totalAmount = 0;
    public Invoice(Customer customer){
        this.customer = customer;
    }

    public void addServices(Service service){
        serviceList.add(service);
        totalAmount+=service.getPrice();
    }

    public void printInvoice(){
        System.out.println("-------------------Invoice-------------------");
        System.out.println("Customer: " + customer.getName() + " | Phone: " + customer.getPhone());
        System.out.println("Car: " + customer.getCarDetails().getBrand() + " | Number: " + customer.getCarDetails().getNumber());
        for (Service service: serviceList){
            System.out.println("Service: " + service.getName() + " | Price: ₹" + service.getPrice());
        }
        System.out.println("Total Amount: ₹" + totalAmount);
    }
}
