package com.demo.main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.DataBean;
import com.demo.beans.TestBean;


public class MainClass {

	public static void main(String[] args) {
			
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("com/demo/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		
		List<String> list1 = t1.getList1();
		for(String str : list1) {
			System.out.printf("list1 : %s\n", str);
		}
		List<Integer> list2 = t1.getList2();
		for(int n : list2) {
			System.out.printf("list2 : %d\n", n);
		}
		List<DataBean> list3 = t1.getList3();
		for(DataBean obj : list3) {
			System.out.printf("list3 : %s\n", obj);
		}

		System.out.println("-----------------------------------");
		
		Set<String> set1 = t1.getSet1();
		Set<Integer> set2 = t1.getSet2();
		Set<DataBean> set3 = t1.getSet3();
		
		for(String str : set1) {
			System.out.printf("set1 : %s\n", str);
		}
		
		for(int value : set2) {
			System.out.printf("set2 : %d\n", value);
		}
		
		for(DataBean obj : set3) {
			System.out.printf("set3 : %s\n", obj);
		}
		
		System.out.println("-------------------------------");
		
		Map<String, Object> map1 = t1.getMap1();
		
		String a1 = (String)map1.get("a1");
		int a2 = (Integer)map1.get("a2");
		DataBean a3 = (DataBean)map1.get("a3");
		DataBean a4 = (DataBean)map1.get("a4");
		List<String> a5 = (List<String>)map1.get("a5");
		DataBean a6 = (DataBean)map1.get("a6");
		
		System.out.printf("a1 : %s\n", a1);
		System.out.printf("a2 : %d\n", a2);
		System.out.printf("a3 : %s\n", a3);
		System.out.printf("a4 : %s\n", a4);
		
		for(String str : a5) {
			System.out.printf("a5 : %s\n", str);
		}
		
		System.out.printf("a6 : %s\n", a6);
		
		System.out.println("---------------------------------");
		
		Properties prop1 = t1.getProp1();
		
		String p1 = prop1.getProperty("p1");
		String p2 = prop1.getProperty("p2");
		String p3 = prop1.getProperty("p3");
		
		System.out.printf("p1 : %s\n", p1);
		System.out.printf("p2 : %s\n", p2);
		System.out.printf("p3 : %s\n", p3);


		ctx.close();
	}	
}
