package com.jnit.app.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jnit.app.model.Course;
import com.jnit.app.repositories.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public Course createCourse(Course course) throws Exception{
		course.setCreatedDateTime(LocalDateTime.now());
		course.setUpdatedDateTime(LocalDateTime.now());
		return courseRepository.save(course);
	}

	
}
