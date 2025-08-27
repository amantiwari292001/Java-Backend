package com.project;

import com.project.Entities.*;

import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------Balaji Garage--------------");
        Garage_Service garageService = new Garage_Service();
        while(true){
            System.out.println("1. Add Customer");
            System.out.println("2. Get Services");
            System.out.println("3. Exit");
            System.out.println("Choose any from the above.");
            int option = sc.nextInt();
            switch (option){
                case 1:
                {System.out.println("Name: ");
                    sc.nextLine();
                    String customerName = sc.nextLine();
                    System.out.println("Phone: ");
                    String customerNumber = sc.next();
                    System.out.println("Car Brand: ");
                    String carBrand = sc.next();
                    System.out.println("Car Number: ");
                    String carNumber = sc.next();
                    garageService.addCustomer(customerName, customerNumber, carBrand, carNumber);}
                    break;
                case 2:
                    System.out.println("Car Number: ");
                    String carNumber = sc.next();
                    garageService.selectServices(carNumber);
                    break;
                case 3:
                    System.out.println("Exiting...Thanks");
                    return;
                default:
                    System.out.println("Wrong Number");
            }
        }
    }
}
