package io.github.guiwespinola.controller;

import io.github.guiwespinola.dtos.OMDBMovieDTO;
import io.github.guiwespinola.service.OmdbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/external/v1/omdb")
public class OmdbController {

    private final OmdbService omdbService;

    @GetMapping
    public ResponseEntity<OMDBMovieDTO> getMovieByTitle() {
        var response = omdbService.findMovieByTitle();
        return ResponseEntity.ok(response.getBody());
    }
//
//    @GetMapping("/${id}")
//    public ResponseEntity<OMDBMovieDTO> getMovieById(@PathVariable String id) {
//        return ResponseEntity.notFound().build();
//        // TODO - IMPLEMENT
//    }

//    @GetMapping("/search/")
//    public List<ResponseEntity<OMDBMovieDTO>> searchMovies(@RequestParam String title,
//                                                           @RequestParam(required = false) String releaseYear) {
//        eturn new OMDBMovieDTO();
//        // TODO - IMPLEMENT
//    }
}
