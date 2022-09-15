package com.lagou.edu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 15:42
 **/

@Configuration
@ComponentScan(value = "com.lagou.edu",
		// 表示扫描过程中需要包含
		includeFilters={
				@ComponentScan.Filter(type= FilterType.ANNOTATION,classes={
						Service.class, Controller.class
				})
		},
		// useDefaultFilters的默认值为true，
		// 表示会自动扫描Controller，Service，Component，Repository注解标注的组件，
		//   此处必须指定为false，不指定还是会扫描com.wb.spring.beans下面其他注解标注的类
		useDefaultFilters=false
)
public class Test {
}
