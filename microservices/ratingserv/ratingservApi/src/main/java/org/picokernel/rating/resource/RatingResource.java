package org.picokernel.rating.resource;

import org.picokernel.rating.resource.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public interface RatingResource {

    @RequestMapping("/books/{bookName}")
    public Rating getRating(@PathVariable("bookName") String bookName);
}
