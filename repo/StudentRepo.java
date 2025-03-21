package com.mruh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mruh.entity.Students;

public interface StudentRepo extends JpaRepository<Students, java.lang.Integer> {

}
