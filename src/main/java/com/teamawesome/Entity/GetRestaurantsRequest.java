package com.teamawesome.Entity;


public class GetRestaurantsRequest {

    private String term;
    private String location;

    public GetRestaurantsRequest(String term, String location) {
        this.term = term;
        this.location = location;

    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
