package com.ggDemo.sbDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ggDemo.sbDemo.entity.Topic;

@Service
public class TopicService {
	List<Topic> topicList= new ArrayList(Arrays.asList(
			new Topic("128","manish","Student",34),
			new Topic("129","Sahni","Student",39),
			new Topic("1230","Abcd","Student",40)));

	public List<Topic> getAllTopic() {
		return topicList;


	}

	public Topic getTopic(String id) {
		Topic topic = new Topic();
		for(int i = 0 ; i<topicList.size();i++) {
			if(topicList.get(i).getId().equals(id)) {
				return topicList.get(i);
			}
		}
		return topic;
	}

	public void addTopic(Topic topic) {
		topicList.add(topic);
		
	}

}
