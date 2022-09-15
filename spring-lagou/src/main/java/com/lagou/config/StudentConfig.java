package com.lagou.config;

import com.lagou.edu.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.UUID;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 15:27
 **/
@Configuration
@ComponentScan(basePackages = "com.lagou.edu")
public class StudentConfig {

	@Bean(value = "student",
	initMethod = "initStudent",
	destroyMethod = "destroyStudent")
//	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	@Lazy
	public Student student(){
		Student student = new Student();

		System.out.println("Creating student...");
		student.setName(UUID.randomUUID().toString());

		return  student;
	}
}
