package com.gg.jpaDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gg.jpaDemo.entity.Course;
import com.gg.jpaDemo.entity.Topic;
import com.gg.jpaDemo.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/topic/{id}/course")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourse(id);
	}
	
	@GetMapping("/topic/{topicId}/course/{id}")
	public  Course   getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
//	
	@PostMapping("/topic/{topicId}/course")
	public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(new Topic(topicId,"","",0));
		courseService.addCourse(course);
	}
//	
	@DeleteMapping("/topic/{topicId}/course/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
	}

	@PutMapping("/topic/{topicId}/course/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"","",0));
		courseService.updateCourse(course);
	}
}


