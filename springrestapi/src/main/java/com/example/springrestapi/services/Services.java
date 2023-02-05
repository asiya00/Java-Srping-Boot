package com.example.springrestapi.services;

import java.util.List;

import com.example.springrestapi.entity.Courses;

public interface Services {
	
	public List<Courses> getcourses();
	
	public Courses getcourse(long courseid);
	
	public Courses addCourse(Courses course);
	
	public Courses updatecourse(Courses course);
	
	public void deletecourse(long courseid);

}
