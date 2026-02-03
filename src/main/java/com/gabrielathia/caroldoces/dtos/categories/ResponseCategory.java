package com.gabrielathia.caroldoces.dtos.categories;

import lombok.Getter;
import lombok.Setter;

public class ResponseCategory {

//Attributes

    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

//Constructors

    public ResponseCategory(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ResponseCategory(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ResponseCategory() {}

}
