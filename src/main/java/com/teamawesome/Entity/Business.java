package com.teamawesome.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Business {

    @JsonProperty("id")
    public String id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("image_url")
    public String image_url;

    @JsonProperty("is_closed")
    public boolean is_closed;

    @JsonProperty("url")
    public String url;

    @JsonProperty("review_count")
    public int review_count;

    @JsonProperty("categories")
    public List<Category> categories;

    @JsonProperty("rating")
    public double rating;

    @JsonProperty("coordinates")
    public Coordinates coordinates;

    @JsonProperty("location")
    public Location location;

    @JsonProperty("phone")
    public String phone;

    @JsonProperty("display_phone")
    public String display_phone;

    @JsonProperty("distance")
    public double distance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public boolean isIs_closed() {
        return is_closed;
    }

    public void setIs_closed(boolean is_closed) {
        this.is_closed = is_closed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getReview_count() {
        return review_count;
    }

    public void setReview_count(int review_count) {
        this.review_count = review_count;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisplay_phone() {
        return display_phone;
    }

    public void setDisplay_phone(String display_phone) {
        this.display_phone = display_phone;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
