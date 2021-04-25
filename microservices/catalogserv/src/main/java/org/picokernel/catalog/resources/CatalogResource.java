package org.picokernel.catalog.resources;

import com.netflix.discovery.DiscoveryClient;
import org.picokernel.books.resources.models.BookInfo;
import org.picokernel.catalog.resources.models.CatalogItem;
import org.picokernel.rating.resource.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private WebClient.Builder builder;
    @Autowired
    // INFO: DiscoveryClient can be used directly in case needed
    private DiscoveryClient discoveryClient;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        String bookName = "Cast away";
        BookInfo book = restTemplate.getForObject("http://bookinfoserv/books/" + bookName, BookInfo.class);
        Rating rating = restTemplate.getForObject("http://ratingserv/ratings/books/" + bookName, Rating.class);
        return Collections.singletonList(
                new CatalogItem(book.getName(), "Cast away book", rating.getRating())
        );
    }
}

/*
BookInfo book = builder.build()
                .get()
                .uri("http://localhost:8083/books/" + bookName)
                .retrieve()
                .bodyToMono(BookInfo.class)
                .block();
 */
