package com.lagou.config;

import com.lagou.edu.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 14:56
 **/

@Configuration
public class PersonConfig {

	@Bean
	public Person person(){
		Person person = new Person();
		person.setUuid(UUID.randomUUID().toString());

		return person;
	}
}
