package com.example.springrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrestapi.entity.Courses;

public interface Coursedao extends JpaRepository<Courses, Long>{

	
}
