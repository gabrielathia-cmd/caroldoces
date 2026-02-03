package com.gabrielathia.caroldoces.services;

import com.gabrielathia.caroldoces.entitys.EntityCategory;
import com.gabrielathia.caroldoces.repositorys.ProductsCategories;
import com.gabrielathia.caroldoces.dtos.categories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;
import java.util.List;

@Service
public class CategoryService {

//Attributes

    private final ProductsCategories repo;

    @Autowired
    public CategoryService(ProductsCategories repo) {
        this.repo = repo;
    }

//Repo Methods

    private EntityCategory createOrSave(EntityCategory entityCategory) {
        return repo.save(entityCategory);
    }

    private List<EntityCategory> findAll(){
        return repo.findAll();
    }

    private EntityCategory findById(long id){
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    private List<EntityCategory> findByName(String name){
        return repo.findByName(name);
    }

    private List<EntityCategory> findByDescription(String description){
        return repo.findByDescription(description);
    }

//Services Methods

    public ResponseCategory createCategoryFull(RequestCategory request) {
        EntityCategory category = new EntityCategory(request.getName(), request.getDescription());
        return new ResponseCategory(category.getId(), category.getName(), category.getDescription());
    }

    public ResponseCategory createCategoryNotFull(RequestCategory request) {
        EntityCategory category = new EntityCategory(request.getName());
        return new ResponseCategory(category.getId(), category.getName());
    }

    public ResponseCategory searchCategoryById(long id) {
        EntityCategory entityCategory = repo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return new ResponseCategory(entityCategory.getId(), entityCategory.getName(), entityCategory.getDescription());
    }
}
