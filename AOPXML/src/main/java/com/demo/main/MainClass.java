package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
		
		TestBean bean1 = ctx.getBean("xml1", TestBean.class);
		
		int a1 = bean1.method1();
		System.out.printf("a1 : %d\n", a1);
		
		ctx.close();

	}

}
