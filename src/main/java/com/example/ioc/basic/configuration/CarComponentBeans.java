package com.example.ioc.basic.configuration;

import com.example.ioc.basic.enyity.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component //一般組件
public class CarComponentBeans {

    @Bean
    public Car car(){
        return new Car();
    }
}
