package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.beans.TestBean3;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
			
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
	
		TestBean1 obj1 = ctx.getBean("obj1", TestBean1.class);
		TestBean2 obj2 = ctx.getBean("obj2", TestBean2.class);
		System.out.println("---------------------------------");
		
		TestBean3 obj3 = ctx.getBean("obj3", TestBean3.class);
		System.out.printf("obj3.data1 : %s\n", obj3.getData1());
		System.out.printf("obj3.data2 : %s\n", obj3.getData2());

		ctx.close();
	}	
}
