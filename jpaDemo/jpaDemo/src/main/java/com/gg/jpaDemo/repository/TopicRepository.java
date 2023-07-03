package com.gg.jpaDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.gg.jpaDemo.entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String>{
	@Query("select p from Topic p  where "+
			"p.name like concat('%', :query, '%')"+
			" OR p.description like concat('%', :query, '%')")
	List<Topic> searchTopic(String query);
	
//	native sql query
	@Query(value = "select * from topics p  where "+
			"p.name like concat('%', :query, '%')"+
			"OR p.description like concat('%', :query, '%')", nativeQuery=true)
	List<Topic> searchTopicBySql(String query);
}
