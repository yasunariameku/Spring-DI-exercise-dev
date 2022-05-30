package com.example.entity;

public class Student {

	private Integer student_id;
	private String student_name;
	private Integer grade;
	private String hometown;
	private Integer major_id;
	
	public Student() {
		
	}
	
	public Student(Integer student_id,String student_name, Integer grade,String hometown, Integer major_id) {
		this.student_id = student_id;
		this.student_name = student_name;
		this.grade = grade;
		this.hometown = hometown;
		this.major_id = major_id;
	}

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public Integer getMajor_id() {
		return major_id;
	}

	public void setMajor_id(Integer major_id) {
		this.major_id = major_id;
	}

	public String getStudentInfo() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", grade=" + grade
				+ ", hometown=" + hometown + ", major_id=" + major_id + "]";
	}
	
	
}
