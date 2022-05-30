package com.example.entity;

public class Major {
	private Integer major_id;
	private String major_name;
	
	public Major() {
		
	}
	
	public Major(Integer major_id, String major_name ) {
		this.major_id = major_id;
		this.major_name = major_name;
	}
	

	public Integer getMajor_id() {
		return major_id;
	}


	public void setMajor_id(Integer major_id) {
		this.major_id = major_id;
	}


	public String getMajor_name() {
		return major_name;
	}


	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}


	
	public String getMajorInfo() {
		return "Major [major_id=" + major_id + ", major_name=" + major_name + "]";
	}
}
