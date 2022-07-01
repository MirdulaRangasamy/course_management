package com.mirdu.course_management.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.mirdu.course_management.entity.Course;
@Service
public class CourseServiceImplementation1 implements CourseService{
	ArrayList<Course> clist = new ArrayList<Course>();
	@Override
	public String addCourse(Course c) {
		clist.add(c);
		return "Course Added Successfully";
	}

	@Override
	public String viewCourse(int cid) {
		for(Course c:clist)
		{
			if(c.getCid() == cid)
				return c.toString();
		}
		return "Course Not available";
	}

	@Override
	public String viewAllCourse() {
		
		return clist.toString();
	}

	@Override
	public String updateCourse(Course c) {
		for(Course c1:clist)
		{
			if(c1.getCid() == c.getCid())
			{
				c1.setCname(c.getCname());
				c1.setDuration(c.getDuration());
				c1.setCredit(c.getCredit());
				return "Course Updated Successfully";
			}
		}
		return "Course not found";
	}

	@Override
	public String deleteCourse(int cid) {
		for(int i=0; i<clist.size(); i++)
		{
			if(clist.get(i).getCid() == cid)
			{
				clist.remove(clist.get(i));
				return "Course deleted Successfully";
			}
		}
		return "Course Not available";
	}
	
}
