package com.demo.beans;

import org.springframework.stereotype.Component;

//IoC 컨테이너가 만들어 질 때 자동으로 객체가 생성된다.
//객체의 주소값을 가져올 때 이름을 통해서 가져올 수 있다.
//Singleton
@Component("t3")
public class TestBean2 {
	
	public TestBean2() {
		System.out.println("TestBean2의 생성자");
	}
}
