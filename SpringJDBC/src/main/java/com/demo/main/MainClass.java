package com.demo.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.JdbcBean;
import com.demo.config.BeanConfigClass;
import com.demo.db.JdbcDAO;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		JdbcDAO dao = ctx.getBean(JdbcDAO.class); //타입으로 가져오기
		
//		JdbcBean bean1 = new JdbcBean();
//		bean1.setInt_data(1);
//		bean1.setStr_data("문자열1");
		
//		JdbcBean bean2 = new JdbcBean();
//		bean2.setInt_data(2);
//		bean2.setStr_data("문자열2");
//		
//		dao.insert_data(bean2); //오라클 DB에 입력
//		JdbcBean bean3 = new JdbcBean();
//		bean3.setInt_data(1);
//		bean3.setStr_data("문자열3");
//		
//		dao.update_data(bean3);
		
		dao.delete_data(1);
		
		List<JdbcBean> list = dao.select_data();
		
		for (JdbcBean bean : list) {
			System.out.printf("int_data : %d\n", bean.getInt_data());
			System.out.printf("str_data : %s\n", bean.getStr_data());
			System.out.println("----------------------------------------");
		}
		
		ctx.close();

	}

}
