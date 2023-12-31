package com.shark.common;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.shark.mapper.SharkInfoMapper;

public class MybatisSessionFactory {

	private static SqlSessionFactory SSF;
	private final static String CONFIG_PATH = "config/mybatis-config.xml";
	
	static {
		try {
			InputStream is = Resources.getResourceAsStream(CONFIG_PATH);
			SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
			SSF = ssfb.build(is);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return SSF;
	}
	
	public static void main(String[] args) {
		SqlSessionFactory ssf = getSqlSessionFactory();
		SqlSession session = ssf.openSession(true);
		SharkInfoMapper siMapper = session.getMapper(SharkInfoMapper.class);
		System.out.println(siMapper.getSharkInfos(null));
		
	}
}
