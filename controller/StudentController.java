package com.mruh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mruh.entity.Students;
import com.mruh.service.StudentService;

@RestController
@CrossOrigin("*")

public class StudentController {
	@Autowired
	private StudentService service;
	@GetMapping("/students")
	public List<Students> getAllStudents(){
		return service.getAllStudents();
		
	}
	

}
