package io.github.guiwespinola.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String year;

    private String genre;

    private String imdbRating;

    private String imdbID;

    private String director;

    private String writer;

    private String actors;

    private String plot;
}
