package com.demo.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


//Singleton이고 객체를 가져올때 생성됨
@Component
@Lazy
public class TestBean3 {
	
	public TestBean3() {
		System.out.println("TestBean3의 생성자");
	}
}
