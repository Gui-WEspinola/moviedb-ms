package io.github.guiwespinola.service;

import io.github.guiwespinola.dtos.MovieDTO;
import io.github.guiwespinola.model.Movie;

public interface MovieService {

    MovieDTO findMovieById(String title);

    MovieDTO save(Movie movie);
}
