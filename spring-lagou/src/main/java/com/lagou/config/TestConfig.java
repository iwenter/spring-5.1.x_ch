package com.lagou.config;

import com.lagou.edu.Student;
import com.lagou.edu.StudentDao;
import com.lagou.edu.StudentService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description todo
 * @Author wenjunbo
 * @Date 2022/9/15 15:39
 **/
@Configuration
@ComponentScan(basePackageClasses = {StudentDao.class, StudentService.class})
public class TestConfig {

}