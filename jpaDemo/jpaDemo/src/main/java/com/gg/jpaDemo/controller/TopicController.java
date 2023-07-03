package com.gg.jpaDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gg.jpaDemo.entity.AccessCard;
import com.gg.jpaDemo.entity.Employee;
import com.gg.jpaDemo.entity.Topic;
import com.gg.jpaDemo.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicService;
	@GetMapping("/demo")
	public void  demo() {
		Employee e = new Employee();
		System.out.println("eee"+e);
		AccessCard c1 = new AccessCard();
		System.out.println("eee"+c1);
	}
	@GetMapping("/topic")
	public List<Topic> getAllTopic() {
		return topicService.getAllTopic();
	}
//	
	@GetMapping("/topic/{id}")
	public  Topic   getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
//	
	@DeleteMapping("topic/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

	@PutMapping("topic/{id}")
	public void updateTopic(@RequestBody Topic topic,
			@PathVariable String id) {
		topicService.updateTopic(topic,id);
	}
	
	//localhost:8080/topic/search?query=english

	@GetMapping("topic/search")
	public ResponseEntity<List<Topic>> searchProducts(
			@RequestParam("query") String query){
		System.out.println("---------------");
		return ResponseEntity.ok(topicService.searchProducts(query));
	}
	

	//localhost:8080/topic/page?pageNo=1&sort=name
	@GetMapping("/topic/page")
	public  Page<Topic>  getTopicsByPage(
			@RequestParam("pageNo") Optional<Integer> pageParam,
			@RequestParam("sort") Optional<String>  sortBy){
		return topicService.getProductsByPage(pageParam,sortBy);
	}

}


