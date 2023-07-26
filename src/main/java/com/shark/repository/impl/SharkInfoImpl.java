package com.shark.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.shark.common.DBcon;
import com.shark.repository.SharkInfo;

public class SharkInfoImpl implements SharkInfo {

	@Override
	public List<Map<String, String>> selectSharkList() {
		List<Map<String, String>> sharkinfo = new ArrayList<>();
		String sql = "SELECT SHARK_NUM, SHARK_NAME, SHARK_AGE, SHARK_BIRTH, SHARK_LENGTH FROM SHARK";
		try (Connection con = DBcon.getCon()){
			try(PreparedStatement ps = con.prepareStatement(sql)){
				try(ResultSet rs = ps.executeQuery()){
					while(rs.next()) {
						Map<String, String> shark = new HashMap<>();
						shark.put("SHARK_NUM", rs.getString("SHARK_NUM"));
						shark.put("SHARK_NAME", rs.getString("SHARK_NAME"));
						shark.put("SHARK_AGE", rs.getString("SHARK_AGE"));
						shark.put("SHARK_BIRTH", rs.getString("SHARK_BIRTH"));
						shark.put("SHARK_LENGTH", rs.getString("SHARK_LENGTH"));
						
						sharkinfo.add(shark);
						
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sharkinfo;
	}

	@Override
	public Map<String, String> selectShark(String sharkNum) {
		
		String sql = "SELECT SHARK_NUM, SHARK_NAME, SHARK_AGE, SHARK_BIRTH, SHARK_LENGTH FROM SHARK WHERE SHARK_NUM=?";
		try (Connection con = DBcon.getCon()){
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setString(1, sharkNum);
				try(ResultSet rs = ps.executeQuery()){
					if(rs.next()) {
						Map<String, String> shark = new HashMap<>();
						shark.put("SHARK_NUM", rs.getString("SHARK_NUM"));
						shark.put("SHARK_NAME", rs.getString("SHARK_NAME"));
						shark.put("SHARK_AGE", rs.getString("SHARK_AGE"));
						shark.put("SHARK_BIRTH", rs.getString("SHARK_BIRTH"));
						shark.put("SHARK_LENGTH", rs.getString("SHARK_LENGTH"));
						
						return shark;
						
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public int insertshark(Map<String, String> shark) {
		String sql ="INSERT INTO SHARK(SHARK_NAME, SHARK_AGE, SHARK_LENGTH)\r\n"
				+ "VALUES(?, ?, ?)";
		try (Connection con = DBcon.getCon()){
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setString(1, shark.get("SHARK_NAME"));
				ps.setString(2, shark.get("SHARK_AGE"));
				ps.setString(3, shark.get("SHARK_LENGTH"));
				
				return ps.executeUpdate();
					
				
			}
		} catch (Exception e) {
			
		}
		return 0;
	}

	@Override
	public int updateshark(Map<String, String> shark) {
		String sql = "UPDATE SHARK SET SHARK_NAME = ?, SHARK_AGE = ?, SHARK_LENGTH=? WHERE SHARK_NUM = ?";
		
		try (Connection con = DBcon.getCon()){
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setString(1, shark.get("SHARK_NAME"));
				ps.setString(2, shark.get("SHARK_AGE"));
				ps.setString(3, shark.get("SHARK_LENGTH"));
				ps.setString(4, shark.get("SHARK_NUM"));
				
				return ps.executeUpdate();
					
				
			}
		} catch (Exception e) {
			
		}
		return 0;
	
	}

	@Override
	public int deleteshark(String shark) {
		String sql = "DELETE FROM SHARK WHERE SHARK_NUM=?";
		
		try (Connection con = DBcon.getCon()){
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setString(1, shark);
				
				return ps.executeUpdate();
					
				
			}
		} catch (Exception e) {
			
		}
		return 0;

	}
	public static void main(String[] args) {
		SharkInfo sharkinfo = new SharkInfoImpl();
		Map<String, String> sharkdata = new HashMap<String, String>();
		sharkdata.put("SHARK_NUM", "4");
		sharkdata.put("SHARK_NAME", "redShark");
		sharkdata.put("SHARK_AGE", "2022");
		sharkdata.put("SHARK_LENGTH", "2023");
		
//		System.out.println(sharkinfo.insertshark(sharkdata));
//		System.out.println(sharkinfo.updateshark(sharkdata));
//		System.out.println(sharkinfo.deleteshark("4"));
		System.out.println(sharkinfo.selectSharkList());
		System.out.println(sharkinfo.selectShark("4"));
	}

	@Override
	public Map<String, String> selectSharkById(String sharkId) {
		String sql = "SELECT SHARK_NUM, SHARK_NAME, SHARK_AGE, SHARK_BIRTH, SHARK_LENGTH FROM SHARK WHERE SHARK_NAME=?";
		try (Connection con = DBcon.getCon()){
			try(PreparedStatement ps = con.prepareStatement(sql)){
				ps.setString(1, sharkId);
				try(ResultSet rs = ps.executeQuery()){
					if(rs.next()) {
						Map<String, String> shark = new HashMap<>();
						shark.put("SHARK_NUM", rs.getString("SHARK_NUM"));
						shark.put("SHARK_NAME", rs.getString("SHARK_NAME"));
						shark.put("SHARK_AGE", rs.getString("SHARK_AGE"));
						shark.put("SHARK_BIRTH", rs.getString("SHARK_BIRTH"));
						shark.put("SHARK_LENGTH", rs.getString("SHARK_LENGTH"));
						
						return shark;
						
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
