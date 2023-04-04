package io.github.guiwespinola.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MovieDTO {

    private String title;

    private String year;

    private String imdbRating;

    private String genre;

    private String director;

    private String writer;

    private String actors;

    private String plot;

    private String imdbID;
}
