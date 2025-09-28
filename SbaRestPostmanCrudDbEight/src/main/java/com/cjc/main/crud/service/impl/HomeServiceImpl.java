package com.cjc.main.crud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.crud.model.Student;
import com.cjc.main.crud.repository.HomeRepository;
import com.cjc.main.crud.service.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI{
	
	@Autowired
	HomeRepository hr;

	@Override
	public Iterable<Student> getAll() {
		// TODO Auto-generated method stub
		return hr.findAll() ;
	}

	@Override
	public Student getOne(int uid) {
		// TODO Auto-generated method stub
		return hr.findAllByUid(uid);
	}
	
	@Override
	public void dataSave(Student s) {
		// TODO Auto-generated method stub
		
		hr.save(s);
	}

	@Override
	public void deletesData(int uid) {
		// TODO Auto-generated method stub
		
		hr.deleteById(uid);
	}
	

}
