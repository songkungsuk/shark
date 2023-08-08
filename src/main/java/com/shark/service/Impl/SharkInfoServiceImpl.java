package com.shark.service.Impl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.shark.common.MybatisSessionFactory;
import com.shark.mapper.SharkInfoMapper;
import com.shark.repository.SharkInfo;
import com.shark.repository.impl.SharkInfoImpl;
import com.shark.vo.SharkInfoVO;

public class SharkInfoServiceImpl implements com.shark.service.SharkInfoService {
	SharkInfo sharks = new SharkInfoImpl();
	SqlSessionFactory ssf = MybatisSessionFactory.getSqlSessionFactory();
	@Override
	public List<SharkInfoVO> selectSharkList(SharkInfoVO shark) {
		try (SqlSession session = ssf.openSession()){
			SharkInfoMapper siMapper = session.getMapper(SharkInfoMapper.class);
			return siMapper.getSharkInfos(null);
		} catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public Map<String, String> selectShark(String sharkNum) {
		
		return sharks.selectShark(sharkNum);
	}

	@Override
	public int insertshark(Map<String, String> shark) {
		
		return sharks.insertshark(shark);
	}

	@Override
	public int updateshark(Map<String, String> shark) {
		
		return sharks.updateshark(shark);
	}

	@Override
	public int deleteshark(String shark) {
		
		return sharks.deleteshark(shark);
	}

	@Override
	public boolean login(Map<String, String> sharkInfo, HttpSession session) {
		String sharkName = sharkInfo.get("SHARK_NAME"); //로그인할때 상어이름저장
		Map<String, String> tmp = sharks.selectSharkById(sharkName); //데이터베이스에서 상어 뽑아냄
		if (tmp != null) {
			String sharkLenth = tmp.get("SHARK_LENGTH"); //데이터베이스 상어 길이
			if(sharkLenth.equals(sharkInfo.get("SHARK_LENGTH"))){ //로그인하는거랑 데이터베이스에있는거랑 같으면
				session.setAttribute("shark", tmp); //세션에 상어정보저장
				return true; //true return
			}
		}
		return false;
	}

}
