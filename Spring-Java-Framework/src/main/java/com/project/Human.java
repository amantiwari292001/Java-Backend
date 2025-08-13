package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Human {

    @Value("45") //To provide default values. 
    private int age;
    public Human(){
        System.out.println("Human Created");
    }

    public int getAge(){
        return age;
    }

    @Autowired //Injecting dependency/creating bean
    Laptop laptop;
    public void runLaptop(){
        laptop.compile();
    }

    @Autowired
    @Qualifier("desktop") //Works same as Primary but used with the usage or below autowired tag. Gets more preference.
    Computer computer; //Bean of Computer are Laptop and Desktop,
    // With @Autowired, we ask framework to get us the appropriate beans.
    // Both the beans are present in Config file, to select one we use @Primary.
    public void runComputer(){
        computer.compile();
    }
}
