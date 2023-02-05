package com.example.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springrestapi.services.*;

import com.example.springrestapi.entity.Courses;

@RestController
public class Controller{
	
	@Autowired
	private Services Services;
	
	@GetMapping("/courses")
	public List<Courses> getcourses(){
		return this.Services.getcourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getcourse(@PathVariable String courseId){
		return this.Services.getcourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path="/courses", consumes="application/json")
	public Courses addCourse(@RequestBody Courses course) {
		return this.Services.addCourse(course);
	}
	
	@PutMapping("/courses")
	public Courses updatecourse(@RequestBody Courses course) {
		return this.Services.updatecourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deletecourse(@PathVariable String courseId) {
		try {
			this.Services.deletecourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
