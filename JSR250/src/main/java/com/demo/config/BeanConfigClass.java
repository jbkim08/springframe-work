package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.demo.beans.DataBean1;
import com.demo.beans.DataBean2;
import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.beans.TestBean3;


@Configuration
public class BeanConfigClass {
	
	@Bean(initMethod = "init1", destroyMethod = "destroy1")
	@Lazy
	public TestBean1 obj1() {
		return new TestBean1();
	}
	
	@Bean
	@Lazy
	public TestBean2 obj2() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean1 data1() {
		return new DataBean1();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	//클래스에서 자동주입 Resource 설정됨
	@Bean
	public TestBean3 obj3() {
		return new TestBean3();
	}
}


