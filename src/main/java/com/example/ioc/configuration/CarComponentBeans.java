package com.example.ioc.configuration;

import com.example.ioc.enyity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component //一般組件
public class CarComponentBeans {

    @Bean
    public Car car(){
        Car car = new Car();
        car.setId(100);
        car.setBrand("Ford");
        return car;
    }
}
