package com.gabrielathia.caroldoces.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class EntityCategory {

//Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

//Constructors

    public EntityCategory(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public EntityCategory(String name) {
        this.name = name;
    }

    public EntityCategory() {}

}
