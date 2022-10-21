package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {
	
	private int data1;
	private DataBean1 data2;
	
	// 자동 주입을 변수에 설정한다. 등록되어있는 DataBean1타입 객체가 자동주입됨
	// 자동으로 setter 메서드가 추가되어 setter 메서드를 통해 주입 받게 된다.
	@Autowired
	private DataBean1 data3;
	
	//Autowired,Qualifier는 이름으로 주입
	@Autowired
	@Qualifier("obj4")
	private DataBean2 data4;
	
	@Autowired
	@Qualifier("obj5")
	private DataBean2 data5;
	
	//required=false 필수가 아님(주입안되도 됨)
	@Autowired(required = false)
	@Qualifier("obj6")
	private DataBean2 data6;

	public int getData1() {
		return data1;
	}

	public DataBean1 getData2() {
		return data2;
	}
	
	// Set 메서드 자동 주입(타입)
	@Autowired
	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public DataBean2 getData6() {
		return data6;
	}
	
}
