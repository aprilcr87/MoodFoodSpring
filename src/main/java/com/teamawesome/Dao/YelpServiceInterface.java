package com.teamawesome.Dao;

import com.teamawesome.Entity.GetRestaurantsResponse;
import com.teamawesome.Entity.GetRestaurantsRequest;

import java.io.IOException;

public interface YelpServiceInterface {


    public GetRestaurantsResponse getRestaurants(GetRestaurantsRequest getRestaurantsRequest) throws IOException;


}
