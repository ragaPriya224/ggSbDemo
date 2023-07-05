package com.ggDemo.moviecatalogservice;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieCatalogController {
	
	@RequestMapping("/catalog/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId){
		return Collections.singletonList(new CatalogItem("hi","Test",4));
		
	}
}
