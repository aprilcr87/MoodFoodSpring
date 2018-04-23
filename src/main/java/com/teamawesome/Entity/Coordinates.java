package com.teamawesome.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coordinates {

    @JsonProperty("latitude")
    public double latitude;

    @JsonProperty("longitude")
    public double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
