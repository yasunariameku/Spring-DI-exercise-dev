package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.entity.Student;
import com.example.service.StudentService;

@Service
public class PgStudentService implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	public List<Student> findAll(){
		return studentDao.findAll();
	}
	
	
}

