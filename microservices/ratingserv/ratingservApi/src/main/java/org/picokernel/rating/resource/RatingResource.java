package org.picokernel.rating.resource;

import org.picokernel.rating.resource.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public interface RatingResource {

    @RequestMapping("/movies/{movieName}")
    public Rating getRating(@PathVariable("movieName") String movieName);
}
