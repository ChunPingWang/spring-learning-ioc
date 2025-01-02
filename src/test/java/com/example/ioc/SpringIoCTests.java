package com.example.ioc;

import com.example.ioc.enyity.Car;
import com.example.ioc.enyity.SalesService;
import com.example.ioc.enyity.StudentEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
class SpringIoCTests {

	@Test
	public void configuration_test(){
		// arrange
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringIoCTests.class);
		Car car = ctx.getBean(Car.class);

		// Assert Car.getId = 100
		Assertions.assertEquals(100, car.getId());
		// Assert Car.getBrand = Ford
		Assertions.assertEquals("Ford", car.getBrand());
	}

	@Test
	public void car_component_test(){
		// arrange
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringIoCTests.class);
		Car car = ctx.getBean(Car.class);

		// Assert Car.getId = 100
		Assertions.assertEquals(100, car.getId());
		// Assert Car.getBrand = Ford
		Assertions.assertEquals("Ford", car.getBrand());
	}

	@Test
	public void  student_repository_test(){
		// arrange
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringIoCTests.class);
		StudentEntity studentEntity = ctx.getBean(StudentEntity.class);
		// assert
		Assertions.assertEquals(123456 , studentEntity.getId());
		Assertions.assertEquals("John", studentEntity.getName());

	}

	@Test
	public void  sales_service_test(){
		// arrange
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringIoCTests.class);
		SalesService service = ctx.getBean(SalesService.class);
		// assert
		Assertions.assertEquals("SalesService", service.getMyService());
	}

}
