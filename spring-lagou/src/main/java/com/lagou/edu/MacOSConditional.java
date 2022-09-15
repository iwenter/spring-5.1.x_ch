package com.lagou.edu;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 18:18
 **/

public class MacOSConditional implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		Environment environment = context.getEnvironment();
		String osName = environment.getProperty("os.name");
		System.out.println("osName = " + osName);

		return osName != null && osName.equals("Mac OS X");

	}
}
