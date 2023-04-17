package io.github.guiwespinola.service.impl;

import com.google.gson.Gson;
import io.github.guiwespinola.dtos.OMDBMovieDTO;
import io.github.guiwespinola.service.OmdbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class OmdbServiceImpl implements OmdbService {

    private final String API_KEY = System.getenv("API_KEY");
    private final String url = "http://www.omdbapi.com/?t=matrix&apikey=9d5e236f";

    private final Gson gson;

    public ResponseEntity<OMDBMovieDTO> findMovieByTitle() {
        try {
            RestTemplate restTemplate = new RestTemplate();
//            var uriParams = createURIParams();
            var response = restTemplate.getForEntity(url, String.class);
            var result = gson.fromJson(response.getBody(), OMDBMovieDTO.class);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ResponseEntity.notFound().build();
    }

    private Map<String, String> createURIParams(String title) {
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put("t", title);
        uriParams.put("apikey", API_KEY);
        return uriParams;
    }
}
