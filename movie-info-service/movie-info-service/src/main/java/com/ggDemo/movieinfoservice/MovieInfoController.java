package com.ggDemo.movieinfoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieInfoController {

	@RequestMapping("/movies/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId){
		return  new Movie(movieId,"spiderman");
	}

}
