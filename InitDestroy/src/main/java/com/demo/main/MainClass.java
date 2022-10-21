package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean1;

import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		TestBean1 java1 = ctx.getBean("java1", TestBean1.class);
		
		ctx.close();
	}	
}
