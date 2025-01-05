package com.example.ioc;

import com.example.ioc.basic.enyity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class IocApplication {

	public static void main(String[] args) {
		ApplicationContext context =
				new AnnotationConfigApplicationContext(IocApplication.class);
		Car car = context.getBean(Car.class);

		System.out.println("Car's id : " + car.getId());
		System.out.println("Car's brand : " + car.getBrand());


	}

}
