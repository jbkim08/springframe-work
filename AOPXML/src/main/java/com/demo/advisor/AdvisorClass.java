package com.demo.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	
	// 호출 메소드 포함 전후의 코드를 작성한다.
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("aroundMethod 호출 1");
		
		//원래 메소드 호출한다.
		Object obj = pjp.proceed();
		
		System.out.println("aroundMethod 호출 2");
		
		return obj;
	}

}
