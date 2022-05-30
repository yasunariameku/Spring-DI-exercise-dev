package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MajorDao;
import com.example.entity.Major;

@Service
public class MajorService {
	@Autowired
	private MajorDao majorDao;
	
	public List<Major> findAll(){
		return majorDao.findAll();
	}
}
