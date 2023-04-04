package io.github.guiwespinola.dtos;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OMDBMovieDTO {

    @SerializedName("Title")
    private String title;

    @SerializedName("Year")
    private Integer year;

    @SerializedName("Rated")
    private String rated;

    @SerializedName("Released")
    private String released;

    @SerializedName("Runtime")
    private String runtime;

    @SerializedName("Genre")
    private String genre;

    @SerializedName("Director")
    private String director;

    @SerializedName("Writer")
    private String writer;

    @SerializedName("Actors")
    private String actors;

    @SerializedName("Plot")
    private String plot;

    @SerializedName("Language")
    private String language;

    @SerializedName("Country")
    private String country;

    @SerializedName("Awards")
    private String awards;

    @SerializedName("Poster")
    private String poster;

    @SerializedName("Ratings")
    private List<Map<String, String>> ratings;

    @SerializedName("Metascore")
    private String metascore;

    @SerializedName("imdbRating")
    private String imdbRating;

    @SerializedName("imdbVotes")
    private String imdbVotes;

    @SerializedName("imdbID")
    private String imdbID;

    @SerializedName("Type")
    private String type;

    @SerializedName("DVD")
    private String DVD;

    @SerializedName("BoxOffice")
    private String boxOffice;

    @SerializedName("Production")
    private String production;

    @SerializedName("Website")
    private String website;

    @SerializedName("Response")
    private Boolean response;
}

