package com.ggDemo.sbDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ggDemo.sbDemo.entity.Course;
import com.ggDemo.sbDemo.entity.Topic;
import com.ggDemo.sbDemo.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/course")
	public List<Course> getAllCourses() {
		return courseService.getAllCourse();
	}
	
	@GetMapping("/course/{id}")
	public  Course   getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@DeleteMapping("topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

	@PutMapping("topic/{id}")
	public void updateTopic(@RequestBody Topic topic,
			@PathVariable String id) {
		topicService.updateTopic(topic,id);
	}
}


