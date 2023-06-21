package com.ggDemo.sbDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ggDemo.sbDemo.entity.Topic;
import com.ggDemo.sbDemo.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	
	@GetMapping("/topic")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();
	}
	

}


