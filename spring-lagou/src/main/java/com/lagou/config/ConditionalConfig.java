package com.lagou.config;

import com.lagou.edu.MacOSCalc;
import com.lagou.edu.MacOSConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 17:58
 **/

@Configuration
@ComponentScan(basePackages = "com.lagou.edu")
public class ConditionalConfig {

	@Bean("macOSCalc")
	@Conditional(value = MacOSConditional.class)
	public MacOSCalc calc() {
		return new MacOSCalc();
	}
}
