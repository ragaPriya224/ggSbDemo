package com.gg.jpaDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.jpaDemo.entity.Course;
import com.gg.jpaDemo.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
//
	public List<Course> getAllCourse(String topicId) {
		List<Course> courseList = new ArrayList<>();
//		courseRepository.findAll().forEach(courseList::add);
		courseRepository.findByTopicId(topicId).forEach(courseList::add);
		return courseList;
	}
	public Course getCourse(String id) {
		return courseRepository.findById(id).get();
	}
//
	public void addCourse(Course course) {
		courseRepository.save(course);
		
	}
//
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
		
//	}

}
