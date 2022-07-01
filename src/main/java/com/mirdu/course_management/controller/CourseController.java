package com.mirdu.course_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mirdu.course_management.entity.Course;
import com.mirdu.course_management.service.CourseServiceImplementation2;

@Controller
public class CourseController {
	@Autowired
	//CourseServiceImplementation1 csi;
	CourseServiceImplementation2 csi;
	
	@RequestMapping("/home")
	public String getCourseHome()
	{
		return "courseHome.jsp";
	}
	
	@RequestMapping("/addCourse")
	@ResponseBody
	public String addCourse(Course c)
	{
		return csi.addCourse(c);
	}
	
	@RequestMapping("/viewCourse")
	@ResponseBody
	public String viewCourse(int cid)
	{
		return csi.viewCourse(cid);
	}
	
	@RequestMapping("/viewAllCourse")
	@ResponseBody
	public String viewAllCourse()
	{
		return csi.viewAllCourse();
	}
	
	@RequestMapping("/updateCourse")
	@ResponseBody
	public String updateCourse(Course c)
	{
		return csi.updateCourse(c);
	}
	
	@RequestMapping("/deleteCourse")
	@ResponseBody
	public String deleteCourse(int cid)
	{
		return csi.deleteCourse(cid);
	}
}
