package io.github.guiwespinola.repository;

import io.github.guiwespinola.dtos.MovieDTO;
import io.github.guiwespinola.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findByTitleAllIgnoreCase(String title);
}
