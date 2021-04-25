package org.picokernel.movies.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/movies")
public interface MoviesResource {
    @RequestMapping("/{movieId}")
    public org.picokernel.movies.resources.models.MovieInfo getMovieById(@PathVariable("movieId") String movieId);
}
