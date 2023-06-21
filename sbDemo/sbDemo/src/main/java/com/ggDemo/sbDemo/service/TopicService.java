package com.ggDemo.sbDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ggDemo.sbDemo.entity.Topic;

@Service
public class TopicService {

	public List<Topic> getAllTopic() {
		List<Topic> topicList= new ArrayList(Arrays.asList(new Topic("128","manish","Student",34),
				new Topic("129","Sahni","Student",39),
				new Topic("1230","Abcd","Student",40)));
		return topicList;
		
		
	}

}
