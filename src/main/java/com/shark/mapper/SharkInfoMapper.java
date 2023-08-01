package com.shark.mapper;

import java.util.List;
import java.util.Map;

public interface SharkInfoMapper {
	List<Map<String, String>> selectSharkInfoList(Map<String, String> shark);
}
