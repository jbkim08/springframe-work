package com.demo.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.demo.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {

		// test1();
		//test2();
		//test3();
		test4();
	}

	// BeanFactory IOC (xml이 클래스 내부에 있을때)
	public static void test1() {
		ClassPathResource res = new ClassPathResource("com/demo/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);

		TestBean t1 = factory.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}

	// BeanFactory IOC (xml이 클래스 외부 프로젝트 경로에 있을때)
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);

		TestBean t1 = factory.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}

	// ApplicationContext - 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");

		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();
	}
	
	// ApplicationContext - 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("beans.xml");

		TestBean t1 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);

		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		ctx.close();
	}
}
