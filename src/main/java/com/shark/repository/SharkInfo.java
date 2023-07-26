package com.shark.repository;

import java.util.List;
import java.util.Map;

public interface SharkInfo {
	List<Map<String, String>> selectSharkList();
	
	Map<String, String> selectShark(String sharkNum);
	
	Map<String, String> selectSharkById(String sharkId);
	
	int insertshark(Map<String, String> shark);
	
	int updateshark(Map<String, String> shark);
	
	int deleteshark(String shark);
}
