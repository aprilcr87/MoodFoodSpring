package com.teamawesome.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teamawesome.Dao.YelpServiceInterface;
import com.teamawesome.Entity.BusinessResponse;
import com.teamawesome.Entity.GetRestaurantsRequest;
import com.teamawesome.Entity.GetRestaurantsResponse;
import com.teamawesome.Entity.Restaurant;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


@Service
public class YelpService implements YelpServiceInterface {


    @Override
    public ResponseEntity<?> getRestaurants(GetRestaurantsRequest request) throws IOException {
//        GetRestaurantsResponse response = new GetRestaurantsResponse();
//        RestTemplate restTemplate = new RestTemplate();
//
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("Authorization", "Bearer " + "");
//
//        String endpoint = "https://api.yelp.com/v3/businesses/search?sort_by=distance&limit=5";
//        endpoint = endpoint + "&term=" + request.getTerm() + "&location=" + request.getLocation();
//        HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);
//        ResponseEntity<String> responseEntity = restTemplate.exchange(endpoint,
//                HttpMethod.GET, entity, String.class);
//
//        System.out.println(responseEntity.getBody());
//        response = new ObjectMapper().readValue(responseEntity.getBody(), GetRestaurantsResponse.class);
//        return response;

//        GetRestaurantsResponse response;
//        RestTemplate restTemplate = new RestTemplate();
//
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("Authorization", "Bearer " + "BEfhZtkrid-6PpLkPAsySs3lDnswwfql6JUoRQ9coBFfGmmRXCRGSvV54ISBHoKS8Y-5xDfy4QCY9pd9yHuTCEN0cSScscPhoSwYzhusaltZHhm2J1Jl_w8ei1zFWnYx");
//
//        String endpoint = "https://api.yelp.com/v3/businesses/search?sort_by=distance&limit=5";
//        endpoint = endpoint + "&term=" + request.getTerm() + "&location=" + request.getLocation();
//        HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);
//        ResponseEntity<String> responseEntity = restTemplate.exchange(endpoint,
//                HttpMethod.GET, entity, String.class);
//
//        System.out.println(responseEntity.getBody());
//        response = new ObjectMapper().readValue(responseEntity.getBody(), GetRestaurantsResponse.class);
//        return new ResponseEntity<>(response, HttpStatus.OK);

        BusinessResponse response;
        //GetRestaurantsResponse response;
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper objMap = new ObjectMapper();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Authorization", "Bearer " + "BEfhZtkrid-6PpLkPAsySs3lDnswwfql6JUoRQ9coBFfGmmRXCRGSvV54ISBHoKS8Y-5xDfy4QCY9pd9yHuTCEN0cSScscPhoSwYzhusaltZHhm2J1Jl_w8ei1zFWnYx");

        String endpoint = "https://api.yelp.com/v3/businesses/search?sort_by=distance&limit=15";
        endpoint = endpoint + "&term=" + request.getTerm() + "&location=" + request.getLocation();
        HttpEntity<String> entity = new HttpEntity<>("parameters", httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(endpoint,
                HttpMethod.GET, entity, String.class);

        System.out.println(responseEntity.getBody());
        //Restaurant getData = objMap.readValue(responseEntity.getBody(), Restaurant.class);
        //response = new ObjectMapper().readValue(responseEntity.getBody(), GetRestaurantsResponse.class);

        response = new ObjectMapper().readValue(responseEntity.getBody(), BusinessResponse.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
