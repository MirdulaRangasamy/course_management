package com.mirdu.course_management.service;

import com.mirdu.course_management.entity.Course;

public interface CourseService {
	public String addCourse(Course c);
	public String viewCourse(int cid);
	public String viewAllCourse();
	public String updateCourse(Course c);
	public String deleteCourse(int cid);
	
}
