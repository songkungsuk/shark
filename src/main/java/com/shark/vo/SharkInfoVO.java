package com.shark.vo;

public class SharkInfoVO {
	private int sharkNum;
	private String sharkName;
	private int sharkAge;
	private String sharkBirth;
	private int sharkLength;
	public int getSharkNum() {
		return sharkNum;
	}
	public void setSharkNum(int sharkNum) {
		this.sharkNum = sharkNum;
	}
	public String getSharkName() {
		return sharkName;
	}
	public void setSharkName(String sharkName) {
		this.sharkName = sharkName;
	}
	public int getSharkAge() {
		return sharkAge;
	}
	public void setSharkAge(int sharkAge) {
		this.sharkAge = sharkAge;
	}
	public String getSharkBirth() {
		return sharkBirth;
	}
	public void setSharkBirth(String sharkBirth) {
		this.sharkBirth = sharkBirth;
	}
	public int getSharkLength() {
		return sharkLength;
	}
	public void setSharkLength(int sharkLength) {
		this.sharkLength = sharkLength;
	}
	@Override
	public String toString() {
		return "SharkInfoVO [sharkNum=" + sharkNum + ", sharkName=" + sharkName + ", sharkAge=" + sharkAge
				+ ", sharkBirth=" + sharkBirth + ", sharkLength=" + sharkLength + "]";
	}
	
	
}
