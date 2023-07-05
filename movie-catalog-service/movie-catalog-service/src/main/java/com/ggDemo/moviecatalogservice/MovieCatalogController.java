package com.ggDemo.moviecatalogservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogController {
	
	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		
		List<Rating> ratingsList = Arrays.asList(new Rating("123",4),
				new Rating("45",3));
		return ratingsList.stream().map(rating ->{
			return new CatalogItem("avengers","descr",4);
		}).collect(Collectors.toList());
//		return Collections.singletonList(new CatalogItem("hi","Test",4));
		
	}
}
