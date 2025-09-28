package com.cjc.main.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.crud.model.Student;
import com.cjc.main.crud.service.HomeServiceI;

@RestController
public class HomeController {
	
	@Autowired
	HomeServiceI hsi;
	
	
	@GetMapping("/getFull")
	public Iterable<Student> getCompleteData() {
		
		Iterable<Student> stuData =  hsi.getAll();
		
		return stuData ;
		
	}
	
	@GetMapping("/getSingle/{uid}")
	public Student getSingleData(@PathVariable("uid") int uid) {
		
		Student st = hsi.getOne(uid);
		
		return st;
	}
	
	
	@PostMapping("/insert")
	public String postData(@RequestBody Student s) {
		
		hsi.dataSave(s);
		
		return "success";
	}
	
	
	@DeleteMapping("/delete/{uid}")
	public String deleteData( @PathVariable("uid") int uid ) {
		
		hsi.deletesData(uid);
		
		return "Deleted";
	}

}
