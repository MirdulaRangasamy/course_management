package com.mirdu.course_management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirdu.course_management.entity.Course;
//@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{

}
