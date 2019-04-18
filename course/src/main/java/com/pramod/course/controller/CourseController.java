package com.pramod.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramod.course.model.Course;
import com.pramod.course.serviceImpl.CourseServiceImpl;

@RestController
public class CourseController {

	@Autowired
	CourseServiceImpl courseService;

	@PostMapping("/addCourses")
	public void addCourses(@RequestBody Course courses) {

		// courseService.addCourses(courses);
	}

	@RequestMapping( "/getAllCourses")
	public String getAllCourseDetails() {
		System.out.println("all course details");
		// return courseService.getAllCourseDetails();
		return "hello";
	}

	@DeleteMapping("/deleteCourse")
	public void deletCourse(@PathVariable int Id) {
		//courseService.deletCourse(Id);

	}

	@PutMapping("/updateCourse")
	public void updateCourse(@PathVariable int id) {
		//courseService.updateCourse(id);

	}

	/*@GetMapping("/getCourseDetail")
	public Course getCourseDetail(@PathVariable int id) {

		//return courseService.getCourseDetail(id);
	}*/
   @RequestMapping(value="/")
	public String message() {

		return "hello world";
	}

}
