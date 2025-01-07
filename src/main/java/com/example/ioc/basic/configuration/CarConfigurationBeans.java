package com.example.ioc.basic.configuration;

import com.example.ioc.basic.enyity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfigurationBeans {

    @Bean
    public Car car(){
        Car car = new Car();
        car.setId(100);
        car.setBrand("Ford");
        return car;
    }
}
