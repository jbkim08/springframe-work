package com.demo.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
	
	//생성자 호출 이후 자동 호출
	@PostConstruct
	public void init2() {
		System.out.println("TestBean2의 init");
	}
	
	//객체가 소멸되기 전에 자동 호출
	@PreDestroy
	public void destroy2() {
		System.out.println("TestBean2의 destroy");
	}
	
}
