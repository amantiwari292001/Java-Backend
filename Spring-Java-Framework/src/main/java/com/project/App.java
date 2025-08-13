package com.project;

import com.project.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Desktop desktop = context.getBean("desktop", Desktop.class); //Method name and class name.
        desktop.compile();
        Desktop newDesktop = context.getBean("desktop", Desktop.class); //New Instance with scope.


        Human human = context.getBean("human", Human.class);
        System.out.println("Age: " + human.getAge());
        human.runLaptop();
        human.runComputer();

    }
}
