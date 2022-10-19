package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// beans.xml 파일을 로딩하기
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
		
		// xml에 정의한 bean 객체의 주소값을 가져온다.
		HelloWorld hello1 = ctx.getBean("hello",HelloWorld.class);
		callMethod(hello1);
			
		ctx.close();

	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}


}



