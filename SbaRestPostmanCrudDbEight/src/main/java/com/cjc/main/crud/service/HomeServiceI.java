package com.cjc.main.crud.service;

import com.cjc.main.crud.model.Student;

public interface HomeServiceI {

	Iterable<Student> getAll();

	Student getOne(int uid);
	
	void dataSave(Student s);

	void deletesData(int uid);


}
