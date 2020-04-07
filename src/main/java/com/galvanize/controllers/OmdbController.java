package com.galvanize.controllers;

import com.galvanize.model.SearchResults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/movies")
public class OmdbController {
    RestTemplate restTemplate;
    private static String OMDB_KEY = "apikey=ae3a01f2";
    private static String BASE_URL = "http://www.omdbapi.com/?" + OMDB_KEY;
    private static String SEARCH_BASE = BASE_URL + "&type=movie&plot=full&s=";
    private static String IMDBID_BASE = BASE_URL + "&plot=full&i=";

    public OmdbController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public SearchResults getResults(@RequestParam String search) {
        return restTemplate.getForObject(SEARCH_BASE + search, SearchResults.class);
    }
}
