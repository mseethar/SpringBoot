package org.picokernel.movies.resources;

import org.picokernel.movies.resources.MoviesResource;
import org.picokernel.movies.resources.models.MovieInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@Configuration
@PropertySource("classpath:/moviedb.properties")
public class MoviesResourceImpl implements MoviesResource {

    @Autowired
    RestTemplate restTemplate;

    @Value("${moviedb.api.key}")
    private String movieDbApiKey;
    @Value("${moviedb.api.url}")
    private String movieDbApiURL;

    public MovieInfo getMovieById(String movieId) {
        String url = String.format(movieDbApiURL, movieId);
        MovieInfo movieInfo = restTemplate.getForObject(url, MovieInfo.class);
        return movieInfo;
    }
}
