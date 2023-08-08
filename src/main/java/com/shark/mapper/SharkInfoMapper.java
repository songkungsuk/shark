package com.shark.mapper;

import java.util.List;

import com.shark.vo.SharkInfoVO;

public interface SharkInfoMapper {
	
	List<SharkInfoVO> getSharkInfos(SharkInfoVO shark);

}
