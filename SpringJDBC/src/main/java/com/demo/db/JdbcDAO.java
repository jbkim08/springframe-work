package com.demo.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.demo.beans.JdbcBean;

//DB의 데이터를 저장/수정/삭제/읽기 
@Component
public class JdbcDAO {
	
	@Autowired
	private JdbcTemplate db;
	
	@Autowired
	private MapperClass mapper;
    
	// 저장
	public void insert_data(JdbcBean bean) {
		String sql = "insert into jdbc_table(int_data,str_data) values(?,?)";
		//입력,수정,삭제를 하는 메소드 update
		db.update(sql, bean.getInt_data(), bean.getStr_data());
	}
	
	// 가져오기
	public List<JdbcBean> select_data(){
		String sql = "select int_data, str_data from jdbc_table";
		List<JdbcBean> list = db.query(sql, mapper);
		return list;
	}
	
	// 수정
	public void update_data(JdbcBean bean) {
	}
	
	// 삭제
	public void delete_data(int int_data) {
	}

}
