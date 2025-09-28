package com.cjc.main.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.crud.model.Student;

@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>{
	
	public Student findAllByUid(int uid);

}
