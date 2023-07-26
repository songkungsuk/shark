package com.shark.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

public interface SharkInfoService {
	List<Map<String, String>> selectSharkList();
	
	Map<String, String> selectShark(String sharkNum);
	
	int insertshark(Map<String, String> shark);
	
	int updateshark(Map<String, String> shark);
	
	int deleteshark(String shark);
	
	boolean login(Map<String, String> sharkInfo, HttpSession session);
}
