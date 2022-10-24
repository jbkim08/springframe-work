package com.demo.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.mapper.MapperInterface;

@Configuration
//패키지 beans에 있는 모든 component들을 빈으로 등록한다.
@ComponentScan(basePackages = {"com.demo.beans"})
public class BeanConfigClass {

	// DataSource
	@Bean
	public BasicDataSource source() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("oracle");
		source.setPassword("1234");
		
		return source;
	}
	
	// SqlSessionFactory : jdbc를 처리하는 객체
	@Bean
	public SqlSessionFactory factory(BasicDataSource source) throws Exception{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(source);
		SqlSessionFactory factory = factoryBean.getObject();
		return factory;
	}
	
	// Mapper 인터페이스 구현 객체 (dao) , SqlSessionFactory 객체가 자동주입되고 MapperInterface 타입으로 선언
	@Bean
	public MapperFactoryBean<MapperInterface> test_mapper(SqlSessionFactory factory) throws Exception{
		MapperFactoryBean<MapperInterface> factoryBean = new MapperFactoryBean<MapperInterface>(MapperInterface.class);
		factoryBean.setSqlSessionFactory(factory);
		return factoryBean;
	}



}
