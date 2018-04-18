package com.teamawesome.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamawesome.Dao.YelpServiceInterface;
import com.teamawesome.Entity.GetRestaurantsRequest;
import com.teamawesome.Entity.GetRestaurantsResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


@Service
public class YelpService implements YelpServiceInterface {


    @Override
    public GetRestaurantsResponse getRestaurants(GetRestaurantsRequest request) throws IOException {

        GetRestaurantsResponse response = new GetRestaurantsResponse();
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + "");

        String endpoint = "https://api.yelp.com/v3/businesses/search?sort_by=distance&limit=5";
        endpoint = endpoint + "&term=" + request.getTerm() + "&location=" + request.getLocation();
        HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(endpoint,
                HttpMethod.GET, entity, String.class);

        System.out.println(responseEntity.getBody());
        response = new ObjectMapper().readValue(responseEntity.getBody(), GetRestaurantsResponse.class);
        return response;
    }
}
