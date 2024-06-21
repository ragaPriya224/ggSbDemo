package com.ggDemo.ratingsdataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingsResource {


	@GetMapping("/ratingsdata/{movieId}")
	public Rating getRating(@PathVariable String movieId){
		return new Rating(movieId,3);
		//return? movie details along with ratings
	}

	@RequestMapping("/ratingsdata/user/{userId}")
	public UserRating getUserRating(@PathVariable String userId){
		List<Rating> ratingsList = Arrays.asList(new Rating("445",1),
				new Rating("123",3));
		UserRating userRating = new UserRating();
		userRating.setRatingsList(ratingsList);
		return userRating;
	}
}
