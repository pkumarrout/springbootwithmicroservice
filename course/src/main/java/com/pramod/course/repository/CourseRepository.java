package com.pramod.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pramod.course.model.Course;
@Repository("CourseRepository")
public interface CourseRepository extends JpaRepository<Course, Integer>{

}
