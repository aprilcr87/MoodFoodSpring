package com.teamawesome.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Region {

    @JsonProperty("center")
    public Center center;

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }
}
