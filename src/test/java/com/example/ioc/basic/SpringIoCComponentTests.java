package com.example.ioc.basic;

import com.example.ioc.basic.enyity.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
class SpringIoCComponentTests {

	@Test
	public void car_component_test(){
		// arrange
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringIoCComponentTests.class);
		Car car = ctx.getBean(Car.class);
		car.setId(100);
		car.setBrand("Ford");

		// Assert Car.getId = 100
		Assertions.assertEquals(100, car.getId());
		// Assert Car.getBrand = Ford
		Assertions.assertEquals("Ford", car.getBrand());
	}
}
