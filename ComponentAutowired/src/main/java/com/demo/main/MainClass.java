package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 t1 = ctx.getBean(TestBean1.class);
		
		System.out.printf("t1.data1 : %s\n", t1.getData1());
		System.out.printf("t1.data2 : %s\n", t1.getData2());
		System.out.printf("t1.data3 : %s\n", t1.getData3());
		System.out.printf("t1.data4 : %s\n", t1.getData4());
		System.out.printf("t1.data5 : %s\n", t1.getData5());
		
		System.out.println("-------------------------------------------");
		
		TestBean2 t2 = ctx.getBean(TestBean2.class);
		
		System.out.printf("t2.data1 : %s\n", t2.getData1());
		System.out.printf("t2.data2 : %s\n", t2.getData2());
		System.out.printf("t2.data3 : %s\n", t2.getData3());
		System.out.printf("t2.data4 : %s\n", t2.getData4());

		ctx.close();
	}	
}
