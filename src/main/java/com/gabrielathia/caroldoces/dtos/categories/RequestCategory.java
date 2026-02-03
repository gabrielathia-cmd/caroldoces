package com.gabrielathia.caroldoces.dtos.categories;

import lombok.Getter;
import lombok.Setter;

public class RequestCategory {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

//Constructors

    public RequestCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public RequestCategory(String name) {
        this.name = name;
        this.description = "No description";
    }

    public RequestCategory() {}

}
