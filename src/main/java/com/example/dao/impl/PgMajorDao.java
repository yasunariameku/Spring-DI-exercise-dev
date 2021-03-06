package com.example.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.MajorDao;
import com.example.entity.Major;

@Repository
public class PgMajorDao implements MajorDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Major> findAll(){
		return jdbcTemplate.query("SELECT * FROM major ORDER BY major_id", 
				new BeanPropertyRowMapper<Major>(Major.class));
	}
	
	
}
