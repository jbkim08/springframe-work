package com.demo.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestBean1 {

	//자동으로 set메서드를 이용해서 객체를 주입
	@Autowired
	private DataBean1 data1;
	
	@Autowired
	@Qualifier("ob2")
	private DataBean2 data2;
	
	@Resource(name = "ob3")
	private DataBean3 data3;

	@Resource(name = "ob4")
	private DataBean3 data4;
	
	@Resource(name = "ob5")
	private DataBean3 data5;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

	public DataBean3 getData3() {
		return data3;
	}

	public DataBean3 getData4() {
		return data4;
	}

	public DataBean3 getData5() {
		return data5;
	}
	
}
