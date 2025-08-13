package com.project;

public class Human {
    private int age;

    public Human(){
        System.out.println("Human Created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("Human Runs");
    }

    private Laptop l;

    public void setL(Laptop l) {
        this.l = l;
    }

    public void runLaptop(){
        l.run();
        System.out.println("Price: " + l.getPrice());
        System.out.println("Brand: " + l.getBrand());
    }

    private Computer comp;

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Computer Working");
        comp.run();
    }
}
