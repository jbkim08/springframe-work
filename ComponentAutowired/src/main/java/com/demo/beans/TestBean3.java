package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean3 {

	private DataBean1 data1;
	private DataBean2 data2;
	
	//기본 생성자가 없고 입력 생성자만 있을때
	//변수 2개 생성자 => 자동으로 타입에 맞는 객체가 주입 : 생성자 주입
	public TestBean3(DataBean1 data1, DataBean2 data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}


	public DataBean1 getData1() {
		return data1;
	}


	public void setData1(DataBean1 data1) {
		this.data1 = data1;
	}


	public DataBean2 getData2() {
		return data2;
	}


	public void setData2(DataBean2 data2) {
		this.data2 = data2;
	}
	

}
