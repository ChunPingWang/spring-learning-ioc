package com.example.ioc;

import com.example.ioc.enyity.StudentEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
class SpringIoCRepositoryTests {

	@Test
	public void  student_repository_test(){
		// arrange
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(SpringIoCRepositoryTests.class);
		StudentEntity studentEntity = ctx.getBean(StudentEntity.class);
		// assert
		Assertions.assertEquals(123456 , studentEntity.getId());
		Assertions.assertEquals("John", studentEntity.getName());

	}
}
