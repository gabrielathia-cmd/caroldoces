package com.gabrielathia.caroldoces.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.gabrielathia.caroldoces.dtos.categories.*;
import com.gabrielathia.caroldoces.services.CategoryService;
import org.springframework.http.ResponseEntity;

@RestController
public class CategoriesController {

//Attribute

    private final CategoryService service;

    @Autowired
    public CategoriesController(CategoryService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @PostMapping("/create-category-full")
    public ResponseEntity<ResponseCategory> createFullCategory(@RequestBody RequestCategory request) {
        ResponseCategory response = service.createCategoryFull(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/create-category-notfull")
    public ResponseEntity<ResponseCategory> createNotFullCategory(@RequestBody RequestCategory request) {
        ResponseCategory response = service.createCategoryNotFull(request);
        return  ResponseEntity.ok(response);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<ResponseCategory> searchCategoryById(@PathVariable long id) {
        ResponseCategory response = service.searchCategoryById(id);
        return ResponseEntity.ok(response);
    }
}
