package com.gg.jpaDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gg.jpaDemo.entity.Topic;
import com.gg.jpaDemo.repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getAllTopic() {
		////		return topicList;
		List<Topic> topicList= new ArrayList<>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
		//
	}

	public Topic getTopic(String id) {
		//		Topic topic = new Topic();
		//		for(int i = 0 ; i<topicList.size();i++) {
		//			if(topicList.get(i).getId().equals(id)) {
		//				return topicList.get(i);
		//			}
		//		}
		//		return topic;
		return topicRepository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		//		topicList.add(topic);
		topicRepository.save(topic);

	}

	public void deleteTopic(String id) {
		//		topicList.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}

	public void updateTopic(Topic topic, String id) {
		//		for(int i = 0 ; i<topicList.size();i++) {
		//			if(topicList.get(i).getId().equals(id)) {
		//				topicList.set(i, topic);
		//				return;
		//			}
		//		}
		topicRepository.save(topic);
	}

}
