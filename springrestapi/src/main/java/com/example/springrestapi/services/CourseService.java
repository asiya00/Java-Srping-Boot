package com.example.springrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springrestapi.dao.Coursedao;
import com.example.springrestapi.entity.Courses;

@Service
public class CourseService implements Services {
	
	@Autowired
	private Coursedao courseDao;

//	List<Courses> list;
	
	public CourseService() {
//		list = new ArrayList<>();
//		list.add(new Courses(145, "Java Core Course", "Java course"));
//		list.add(new Courses(146, "Spring boot api", "Spring boot course"));
//		
	}
	
	
	
	@Override
	public List<Courses> getcourses() {
		// TODO Auto-generated method stub
//		return list;
		return courseDao.findAll();
	}



	@Override
	public Courses getcourse(long courseid) {
		// TODO Auto-generated method stub
//		Courses c = null;
//		for (Courses course:list) {
//			if(course.getId() == courseid) {
//				c = course;
//				break;
//			}
//		}
		
		return courseDao.findById(courseid).get();
	}



	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
//		list.add(course);
		courseDao.save(course);
		return course;
	}



	@Override
	public Courses updatecourse(Courses course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
//		for(Courses c:list) {
//			if(c.getId() == course.getId()) {
//				c.setTitle(course.getTitle());
//				c.setDescription(course.getDescription());
//				break;
//			}
//		}
		return course;
	}



	@Override
	public void deletecourse(long courseid) {
		// TODO Auto-generated method stub
//		for (int i=0; i<list.size(); i++) {
//			if(list.get(i).getId() == courseid) {
//				list.remove(i);
//				break;
//			}
//		}
		Courses entity = courseDao.getOne(courseid);
		courseDao.delete(entity);
		
	}
	


}
