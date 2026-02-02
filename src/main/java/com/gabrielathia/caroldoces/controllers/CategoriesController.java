package com.gabrielathia.caroldoces.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }



}
