package org.picokernel.catalog.resources;

import com.netflix.discovery.DiscoveryClient;
import org.picokernel.catalog.resources.models.CatalogItem;
import org.picokernel.movies.resources.models.MovieInfo;
import org.picokernel.rating.resource.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient.Builder builder;
    //@Autowired
    // INFO: DiscoveryClient can be used directly in case needed
    //private DiscoveryClient discoveryClient;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        String movieName = "Cast away";
        MovieInfo movie = restTemplate.getForObject("http://movieinfoserv/movies/" + userId, MovieInfo.class);
        Rating rating = restTemplate.getForObject("http://ratingserv/ratings/movies/" + movieName, Rating.class);
        return Collections.singletonList(
                new CatalogItem(movie.getTitle(), movie.getOverview(), movie.getVoteAverage())
        );
    }
}

/*
movieInfo movie = builder.build()
                .get()
                .uri("http://localhost:8083/movies/" + movieName)
                .retrieve()
                .bodyToMono(movieInfo.class)
                .block();
 */
