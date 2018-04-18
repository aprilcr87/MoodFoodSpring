package com.teamawesome.Controller;


import com.teamawesome.Entity.GetRestaurantsRequest;
import com.teamawesome.Entity.GetRestaurantsResponse;
import com.teamawesome.Service.YelpService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/restaurants")
public class RestaurantController {


    private YelpService yelpService;

    public RestaurantController(YelpService yelpService){
        this.yelpService = yelpService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public GetRestaurantsResponse getRestaurants(@RequestParam("term") String term, @RequestParam("location") String location) throws IOException {
        GetRestaurantsRequest getRestaurantsRequest = new GetRestaurantsRequest(term, location);
        return yelpService.getRestaurants(getRestaurantsRequest);
    }
}
