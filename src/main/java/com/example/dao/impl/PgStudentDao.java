package com.example.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.StudentDao;
import com.example.entity.Student;

@Repository
public class PgStudentDao implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Student> findAll(){
		return jdbcTemplate.query("SELECT * FROM student ORDER BY student_id",
				new BeanPropertyRowMapper<Student>(Student.class));
	}
}
