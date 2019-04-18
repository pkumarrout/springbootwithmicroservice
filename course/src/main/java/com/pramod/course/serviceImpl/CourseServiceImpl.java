package com.pramod.course.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pramod.course.model.Course;
import com.pramod.course.repository.CourseRepository;
import com.pramod.course.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseRepository courseRepository;

	@Override
	public void addCourses(Course courses) {
		courseRepository.save(courses);

	}

	@Override
	public List<Course> getAllCourseDetails() {

		return courseRepository.findAll();
	}

	@Override
	public void deletCourse(int id) {
		courseRepository.deleteById(id);

	}

	@Override
	public void updateCourse(int id) {
		// courseRepository.save(entity);

	}

	@Override
	public Course getCourseDetail(int id) {
		// TODO Auto-generated method stub
		return courseRepository.getOne(id);
	}

}
