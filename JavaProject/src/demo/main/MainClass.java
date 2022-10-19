package demo.main;

import demo.beans.HelloWorldEn;
import demo.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorldKo hello1 = new HelloWorldKo();
		callMethod(hello1);

	}
	
	public static void callMethod(HelloWorldKo hello) {
		hello.sayHello();
	}

}
