package com.teamawesome.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    @JsonProperty("title")
    public String title;

    @JsonProperty("alias")
    public String alias;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
