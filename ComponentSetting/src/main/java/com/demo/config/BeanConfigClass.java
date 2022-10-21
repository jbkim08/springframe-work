package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.beans.TestBean2;

@Configuration
@ComponentScan(basePackages = "com.demo.beans")
public class BeanConfigClass {
	//TestBean1~5까지 컴포넌트스캔으로 등록됨 
	//더해서 TestBean2타입 t5, t6를 등록 (t3 컨포넌트로 등록)
	@Bean
	public TestBean2 t5() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean2 t6() {
		return new TestBean2();
	}	
}


