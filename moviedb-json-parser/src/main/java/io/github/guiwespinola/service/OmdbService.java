package io.github.guiwespinola.service;

import io.github.guiwespinola.dtos.OMDBMovieDTO;
import org.springframework.http.ResponseEntity;

public interface OmdbService {

    ResponseEntity<OMDBMovieDTO> findMovieByTitle();
}
