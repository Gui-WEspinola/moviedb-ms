package io.github.guiwespinola.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Movie {

    @Id
    private Long id;

    private String title;

    private String year;

    private String genre;

    private String imdbRating;

    private String imdbId;
}
