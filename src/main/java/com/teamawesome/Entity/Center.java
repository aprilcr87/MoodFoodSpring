package com.teamawesome.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Center {

    @JsonProperty("longitude")
    public double longitude;

    @JsonProperty("latitude")
    public double latitude;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
