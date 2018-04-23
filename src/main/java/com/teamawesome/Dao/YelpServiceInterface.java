package com.teamawesome.Dao;

import com.teamawesome.Entity.GetRestaurantsRequest;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface YelpServiceInterface {


    public ResponseEntity<?> getRestaurants(GetRestaurantsRequest getRestaurantsRequest) throws IOException;


}
