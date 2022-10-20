package com.demo.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// init 메소드 호출 전 (빈객체의 주소, 이름 )을 매개변수로 자동 실행됨
		System.out.println("before");
		
		switch(beanName) {
		case "t1" : 
			System.out.println("id가 t1인 bean 객체 생성");
			break;
		case "t2" :
			System.out.println("id가 t2인 bean 객체 생성");
			break;
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("after");
		return bean;
	}
}
