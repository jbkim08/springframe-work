package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		TestBean1 java1 = ctx.getBean("java1", TestBean1.class);
		System.out.printf("java1.data1 : %d\n", java1.getData1());
		System.out.printf("java1.data2 : %s\n", java1.getData2());
		System.out.printf("java1.data3 : %s\n", java1.getData3());
		System.out.printf("java1.data4 : %s\n", java1.getData4());
		System.out.printf("java1.data5 : %s\n", java1.getData5());
		System.out.printf("java1.data6 : %s\n", java1.getData6());
		
		System.out.println("-----------------------------------------");
		
		TestBean2 java2 = ctx.getBean("java2", TestBean2.class);
		System.out.printf("java2.data1 : %d\n", java2.getData1());
		System.out.printf("java2.data2 : %s\n", java2.getData2());
		System.out.printf("java2.data3 : %s\n", java2.getData3());
		System.out.printf("java2.data4 : %s\n", java2.getData4());
		
		ctx.close();
	}	
}
