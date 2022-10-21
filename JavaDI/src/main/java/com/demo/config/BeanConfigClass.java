package com.demo.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.demo.beans.DataBean1;
import com.demo.beans.DataBean2;
import com.demo.beans.DataBean3;
import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.beans.TestBean3;

@Configuration
public class BeanConfigClass {
	
	//생성자 주입
	@Bean
	public TestBean1 java1() { 
		return new TestBean1(200, "문자열2", new DataBean1());
	}
	//set메서드 주입
	@Bean
	public TestBean1 java2() {
		TestBean1 t1 = new TestBean1();
		t1.setData1(400);
		t1.setData2("문자열4");
		t1.setData3(new DataBean1());
		return t1;
	}
	
	@Bean
	public DataBean2 data1() {
		return new DataBean2();
	}
	
	@Bean
	public DataBean2 data2() {
		return new DataBean2();
	}
	
	// 이름으로 자동주입(스프링프레임워크 5.0이상에서 더이상 안쓰도록)
	@Bean(autowire = Autowire.BY_NAME)
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	@Bean
	public DataBean3 data100() {
		return new DataBean3();
	}
	
	// 타입으로 자동주입 위의 data100이 자동 주입됨
	@Bean(autowire = Autowire.BY_TYPE)
	public TestBean3 java4() {
		return new TestBean3();
	}
	
}


