package com.project.Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Garage_Service {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Customer> customer = new HashMap<>();
    ArrayList<Service> availableServices = new ArrayList<>();

    public Garage_Service(){
        loadServices();
    }

    public void loadServices(){
        availableServices.add(new Service("Washing", 500));
        availableServices.add(new Service("Oil Change", 1250));
        availableServices.add(new Service("Break Change", 1500));
        availableServices.add(new Service("Polish", 400));
        availableServices.add(new Service("Tyre Change", 1800));
    }

    public void addCustomer(String name, String phone, String carBrand, String carNumber){
        Car carDetails = new Car(carBrand, carNumber);
        Customer customerDetails = new Customer(name, phone, carDetails);
        customer.put(carDetails.getNumber(), customerDetails);
    }

    public void selectServices(String carNumber){
        if(!customer.containsKey(carNumber)){
            System.out.println("No car found.");
            return;
        }

        System.out.println("Available Services: ");
        for(Service service: availableServices){
            System.out.println(availableServices.indexOf(service) + 1 + " " + service.getName());
        }

        Invoice invoice = new Invoice(customer.get(carNumber));
        while(true){
            System.out.println("Enter the service number to add or 0 to exit.");
            System.out.println("Select anyone");
            int choice = sc.nextInt();
            if(choice>0 && choice<=availableServices.size()){
                invoice.addServices(availableServices.get(choice-1));
            }else {
                break;
            }
        }
        invoice.printInvoice();
    }
}
