package com.demo.beans;

import javax.annotation.Resource;

public class TestBean3 {
	
	// 변수의 이름과 동일한 이름의 Bean이 주입된다.
	@Resource(name = "data1")
	private DataBean1 data100;
	
	@Resource(name = "data2")
	private DataBean2 data200;

	//get메서드만 자동완성
	public DataBean1 getData1() {
		return data100;
	}

	public DataBean2 getData2() {
		return data200;
	}
	
}
