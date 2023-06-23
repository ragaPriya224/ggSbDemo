package com.gg.jpaDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gg.jpaDemo.entity.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String>{

}
