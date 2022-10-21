package com.demo.beans;

import org.springframework.stereotype.Component;

//IoC 컨테이너 객체를 생성할 때 자동으로 객체가 생성된다.
//타입을 통해 등록된 Bean 객체를 가져올 수 있다
//Singleton
@Component
public class TestBean1 {
	
	public TestBean1() {
		System.out.println("TestBean1의 생성자");
	}
}
