package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean3 {

	private DataBean1 data1;
	private DataBean2 data2;
	
	public TestBean3(DataBean1 data1, DataBean2 data2) {
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
