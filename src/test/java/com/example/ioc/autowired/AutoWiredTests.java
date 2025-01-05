package com.example.ioc.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
public class AutoWiredTests {

    @Autowired
    TestComponent testComponent;

    @Test
    public void springioc_car_autowired_test(){
        Assertions.assertEquals(100, testComponent.getCar().getId());
        Assertions.assertEquals("Ford", testComponent.getCar().getBrand());
    }
}
