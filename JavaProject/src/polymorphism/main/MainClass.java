package polymorphism.main;


import phoymorphism.beans.HelloWorld;
import phoymorphism.beans.HelloWorldEn;
import phoymorphism.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorld hello1 = new HelloWorldKo();
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldEn();
		callMethod(hello2);

	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
