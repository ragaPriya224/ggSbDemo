package com.gg.jpaDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
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

	public List<Topic> searchProducts(String query) {
		List<Topic> output = topicRepository.searchTopic(query);
		return output;
	}

	public Page<Topic> getProductsByPage(Optional<Integer> pageParam, Optional<String> sortBy) {
//		int page, int size, Direction direction, String... properties
		return	topicRepository.findAll(
				PageRequest.of(
						pageParam.orElse(0),  //page number
						3, //3 records per page
				Direction.DESC, //Direction
				sortBy.orElse("id"))); // sort based on column
	}

}
