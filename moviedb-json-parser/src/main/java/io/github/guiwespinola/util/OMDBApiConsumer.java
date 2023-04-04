package io.github.guiwespinola.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import io.github.guiwespinola.dtos.OMDBMovieDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.init.ResourceReader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor

public class OMDBApiConsumer {

    private static final String API_KEY = "9d5e236f";
    private final String url = "http://www.omdbapi.com/?t=matrix&apikey=9d5e236f";

    private final ObjectMapper objMapper;

    private final Gson gson;


    public ResponseEntity<OMDBMovieDTO> findMovieByTitle(String title) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            var uriParams = createURIParams(title);
            var response = restTemplate.getForEntity(url, String.class);
            System.out.println(response.getBody());
            var result = gson.fromJson(response.getBody(), OMDBMovieDTO.class);
            System.out.println(result);
            return ResponseEntity.ok(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity.notFound().build();
    }

    private Map<String,String> createURIParams(String title) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put("t", title);
        uriParams.put("apikey", API_KEY);
        return uriParams;
    }
}
