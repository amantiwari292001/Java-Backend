package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //Spring: Spring is a framework which allows us to create business logic, Restfull apis and manage server-side components efficiently.
        //It works with two concepts, IoC and DI.
        //IoC: Inversion of Control, Where the object creation part is handled by a container or a framework.
        //DI: Dependency Injection, It is a way to achieve IoC. This promotes loose coupling and easier testing
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //This creates/provides the container.
        Human h = context.getBean("human", Human.class); //Here object gets created with the id of the class configured in xml, only once.
        h.run();
        h.setAge(10);
        System.out.println("Age " + h.getAge());
        h.runLaptop();
        h.code();
        System.out.println( "Hello World!" );
    }
}

