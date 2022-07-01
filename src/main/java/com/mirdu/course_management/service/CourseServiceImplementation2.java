package com.mirdu.course_management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirdu.course_management.dao.CourseRepo;
import com.mirdu.course_management.entity.Course;
@Service
public class CourseServiceImplementation2 implements CourseService{

	@Autowired
	CourseRepo cr;
	
	@Override
	public String addCourse(Course c) {
		cr.save(c);
		return "Course Added Successfully";
	}

	@Override
	public String viewCourse(int cid) {
		Course c = cr.findById(cid).orElse(null);
		if (c!=null)
			return c.toString();
		return "Course not available";
	}

	@Override
	public String viewAllCourse() {
		return cr.findAll().toString();
	}

	@Override
	public String updateCourse(Course c) {
		Course c1 = cr.findById(c.getCid()).orElse(null);
		if(c1!=null)
		{
			cr.delete(c1);
		}
		cr.save(c);
		return "Course got updated";
	}

	@Override
	public String deleteCourse(int cid) {
		Course c1 = cr.findById(cid).orElse(null);
		if(c1!=null)
		{
			cr.delete(c1);
			return "Course deleted";
		}
		else
		{
			return "Course not available";
		}
	}

}
