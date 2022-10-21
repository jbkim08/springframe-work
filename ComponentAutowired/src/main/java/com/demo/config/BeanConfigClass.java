package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.beans.DataBean3;


@Configuration
@ComponentScan(basePackages = "com.demo.beans")
public class BeanConfigClass {

	@Bean
	public DataBean3 ob4() {
		return new DataBean3();
	}
	
	@Bean
	public DataBean3 ob5() {
		return new DataBean3();
	}

}


