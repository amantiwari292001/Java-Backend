package com.project.config;

import com.project.Desktop;
import com.project.Human;
import com.project.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype") //Helps in creating different instances.
//    @Primary
    public Desktop desktop(){
        //In java based framework, we just need to create a method which returns an object and add a Bean tag.
        //Bean tag helps the framework to inject the dependency.
        return new Desktop();
    }

    @Bean
    @Scope("prototype")
    public Laptop laptop(){
        return new Laptop();
    }

    @Bean
    @Scope("prototype")
    public Human human(){
        return new Human();
    }
}
