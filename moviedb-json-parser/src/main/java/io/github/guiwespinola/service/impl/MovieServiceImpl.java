package io.github.guiwespinola.service.impl;

import io.github.guiwespinola.dtos.MovieDTO;
import io.github.guiwespinola.model.Movie;
import io.github.guiwespinola.repository.MovieRepository;
import io.github.guiwespinola.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    private final ModelMapper mapper;

    @Override
    public MovieDTO findMovieById(String title) {
        var movie = movieRepository.findByTitleAllIgnoreCase(title)
                .orElseThrow(() -> new RuntimeException("msg"));

        return mapper.map(movie, MovieDTO.class);
    }

    @Override
    public MovieDTO save(Movie movie) {
        return mapper.map(movieRepository.save(movie), MovieDTO.class);
    }
}
