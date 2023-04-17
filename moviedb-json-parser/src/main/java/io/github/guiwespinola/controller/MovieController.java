package io.github.guiwespinola.controller;

import io.github.guiwespinola.dtos.MovieDTO;
import io.github.guiwespinola.model.Movie;
import io.github.guiwespinola.service.MovieService;
import io.github.guiwespinola.service.OmdbService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    private final OmdbService omdbService;

    private final ModelMapper mapper;

    @GetMapping
    public MovieDTO getMovie(@RequestParam String title) {
        return movieService.findMovieById(title);
    }

    @PostMapping("/omdb/api/")
    public ResponseEntity<MovieDTO> postMovie(@RequestParam String title) {
        var response = omdbService.findMovieByTitle();
        var movie = mapper.map(response.getBody(), MovieDTO.class);
        System.out.println(movie);
        return ResponseEntity.status(response.getStatusCode()).body(movieService.save(mapper.map(movie, Movie.class)));
    }
    // TODO Post movie by Title

    // TODO Find Movie by Title, ID and other parameters

    // TODO

}
