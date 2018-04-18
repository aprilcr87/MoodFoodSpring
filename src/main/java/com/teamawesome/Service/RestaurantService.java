package com.teamawesome.Service;


import com.teamawesome.Dao.RestaurantRepository;
import com.teamawesome.Entity.Restaurant;
import org.springframework.stereotype.Service;


@Service
public class RestaurantService {

    private RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository){
        this.restaurantRepository = restaurantRepository;
    }

    public Iterable<Restaurant> list() {
        return restaurantRepository.findAll();
    }
}
