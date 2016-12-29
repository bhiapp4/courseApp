package com.jnit.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.app.model.Course;
import com.jnit.app.model.SkillLevel;
import com.jnit.app.model.Topic;

@RestController
@RequestMapping("homec")
public class HomeController {

	@GetMapping("home")
	public String sayHello(){
		return "Hello to Spring REST mvc";
	}
	
	@GetMapping(path="course")
	public Course getCourse(){
		Course course = new Course();
		course.setName("Java");
		course.setLevel(SkillLevel.BEGINNER);
		course.setType("IT");
		Topic topic = new Topic();
		topic.setCourse(course);
		topic.setName("data types");
		course.getTopics().add(topic);
		return course;
	}

}
