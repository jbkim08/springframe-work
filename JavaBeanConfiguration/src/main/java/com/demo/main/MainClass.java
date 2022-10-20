package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.beans.TestBean3;
import com.demo.beans.TestBean4;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
			
		ClassPathXmlApplicationContext ctx1 =
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
		
		TestBean1 xml1 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml1 : %s\n", xml1);
		
		TestBean1 xml11 = ctx1.getBean("xml1", TestBean1.class);
		System.out.printf("xml11 : %s\n", xml11);

		ctx1.close();
		System.out.println("==========================================");		
		//java 파일을 불러오는 방식
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		//빈 객체의 이름이 메서드명과 같음
		TestBean1 java1 = ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java1 : %s\n", java1);
		
		TestBean1 java11 = ctx2.getBean("java1", TestBean1.class);
		System.out.printf("java11 : %s\n", java11);
		
		TestBean1 java600 = ctx2.getBean("java600", TestBean1.class);
		System.out.printf("java600 : %s\n", java600);
		
		System.out.println("-----------------------------------------------");
		
		TestBean2 java2 = ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java2 : %s\n", java2);
		
		TestBean2 java22 = ctx2.getBean("java2", TestBean2.class);
		System.out.printf("java22 : %s\n", java22);
		
		System.out.println("-----------------------------------------------");
		
		TestBean3 java3 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java3 : %s\n", java3);
		
		TestBean3 java33 = ctx2.getBean("java3", TestBean3.class);
		System.out.printf("java33 : %s\n", java33);
		
		System.out.println("-----------------------------------------------");
		
		TestBean4 java4 = ctx2.getBean(TestBean4.class);
		System.out.printf("java4 : %s\n", java4);
		
		TestBean4 java5 = ctx2.getBean(TestBean4.class);
		System.out.printf("java5 : %s\n", java5);
		
		
		ctx2.close();
	}	
}
