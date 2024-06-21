package com.ggDemo.moviecatalogservice;

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

	//	@Autowired
	//	private WebClient.Builder webClientBuilder;

	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){

		//		List<Rating> ratingsList = Arrays.asList(new Rating("123",4),
		//				new Rating("45",3));
		UserRating userRating = rt.getForObject("http://localhost:8083/ratingsdata/user/33",
				UserRating.class);

		return userRating.getRatingsList().stream()
				.map(ratingData ->{ 
					Movie movie= rt
							.getForObject("http://localhost:8082/movies/"
									+ratingData.getMoveiId(),
									Movie.class);

					//			Movie  movie = webClientBuilder.build()
					//					.get() //chaining mechanism.get
					//					.uri("http://localhost:8082/movies/"+rating.getMoveiId())
					//					.retrieve() //fetch
					//					.bodyToMono(Movie.class)
					//					.block();

					return new CatalogItem(movie.getName(),"",ratingData.getRating());
				}).collect(Collectors.toList());
		//		return Collections.singletonList(new CatalogItem("hi","Test",4));

	}
}
