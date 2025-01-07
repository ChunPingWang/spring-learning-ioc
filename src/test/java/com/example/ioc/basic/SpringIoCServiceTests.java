package com.example.ioc.basic;

import com.example.ioc.basic.enyity.SalesService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
class SpringIoCServiceTests {

	@Test
	public void  sales_service_test(){
		// arrange
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringIoCServiceTests.class);
		SalesService service = ctx.getBean(SalesService.class);
		// assert
		Assertions.assertEquals("SalesService", service.getMyService());
	}

}
