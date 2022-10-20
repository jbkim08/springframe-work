package com.demo.beans;

public class TestBean2 {
	
	//클래스 DataBean타입 객체를 변수
	private DataBean data1;
	private DataBean data2;
	
	//기본 생성자가 없기 때문에 객체 2개가 입력되어야 됨!
	public TestBean2(DataBean data1, DataBean data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void printData() {
		//객체의 주소값이 출력됨
		System.out.printf("data1 : %s\n", data1);
		System.out.printf("data2 : %s\n", data2);
	}
	
		
}
