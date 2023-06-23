package com.ggDemo.sbDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ggDemo.sbDemo.entity.Course;
import com.ggDemo.sbDemo.entity.Topic;

@Service
public class CourseService {
	List<Course>  courseList= new ArrayList(Arrays.asList(
			new Course("128","manish","Student",34),
			new Course("129","Sahni","Student",39),
			new Course("1230","Abcd","Student",40)));

	public List<Course> getAllCourse() {
		return courseList;


	}

	public Course getTopic(String id) {
		Course course = new Course();
		for(int i = 0 ; i<courseList.size();i++) {
			if(courseList.get(i).getId().equals(id)) {
				return courseList.get(i);
			}
		}
		return course;
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
		
	}

	public void deleteTopic(String id) {
		topicList.removeIf(t -> t.getId().equals(id));
	}

	public void updateTopic(Topic topic, String id) {
		for(int i = 0 ; i<topicList.size();i++) {
			if(topicList.get(i).getId().equals(id)) {
				topicList.set(i, topic);
				return;
			}
		}
		
	}

}
