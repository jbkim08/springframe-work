package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.demo.beans.TestBean1;

@Configuration
public class BeanConfigClass {
	
	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Lazy
	public TestBean1 java1() { 
		return new TestBean1();
	}
	
}
