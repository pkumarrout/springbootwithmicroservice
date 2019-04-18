package com.pramod.course.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pramod.course.model.Course;
@Service("CourseService")
public interface CourseService {
	public void addCourses(Course courses);

	public List<Course> getAllCourseDetails();

	public void deletCourse(int Id);

	public void updateCourse(int id);

	public Course getCourseDetail(int id);

}
