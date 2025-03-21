package com.mruh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mruh.entity.Students;
import com.mruh.repo.StudentRepo;


@Service

public class StudentService {
	@Autowired
	private StudentRepo repo;
	public List<Students> getAllStudents(){
		return repo.findAll();
	
}
}
