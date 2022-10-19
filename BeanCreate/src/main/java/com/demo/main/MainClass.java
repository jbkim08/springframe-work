package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
		
		//TestBean t0 = ctx.getBean(TestBean.class);
		// id가 test1인 bean 객체의 주소값을 받아온다.
		TestBean t1 = ctx.getBean("test1",TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("test1",TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		// id가 test2인 bean 객체의 주소값을 받아온다.
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t3 : %s\n", t3);
		
		TestBean t4 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t4 : %s\n", t4);

		// id가 test3인 bean 객체의 주소값을 받아온다.
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t5 : %s\n", t5);
		
		TestBean t6 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t6 : %s\n", t6);

			
		ctx.close();
	}	
}
