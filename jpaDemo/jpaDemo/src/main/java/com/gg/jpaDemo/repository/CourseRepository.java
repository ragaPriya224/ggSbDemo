package com.gg.jpaDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gg.jpaDemo.entity.Course;


public interface CourseRepository extends JpaRepository<Course,String>{

	
	List<Course> findByTopicId(String topicId);
//	findByTopicName(String name);
}
