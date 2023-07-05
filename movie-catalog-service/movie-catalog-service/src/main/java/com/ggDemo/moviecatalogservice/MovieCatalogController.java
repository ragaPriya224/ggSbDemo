package com.ggDemo.moviecatalogservice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieCatalogController {
	@Autowired
	private   RestTemplate rt;
	
	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		
		List<Rating> ratingsList = Arrays.asList(new Rating("123",4),
				new Rating("45",3));
		
//		RestTemplate rt = new RestTemplate();
		return ratingsList.stream().map(rating ->{
			Movie movie= rt.getForObject("http://localhost:8082/movies/"+rating.getMoveiId(), Movie.class);
			return new CatalogItem(movie.getName(),"",rating.getRating());
		}).collect(Collectors.toList());
//		return Collections.singletonList(new CatalogItem("hi","Test",4));
		
	}
}
