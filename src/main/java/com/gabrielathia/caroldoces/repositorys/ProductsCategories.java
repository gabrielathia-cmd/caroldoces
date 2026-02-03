package com.gabrielathia.caroldoces.repositorys;

import java.util.*;
import com.gabrielathia.caroldoces.entitys.EntityCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsCategories extends JpaRepository<EntityCategory, Long> {

    List<EntityCategory> findByName(String name);
    List<EntityCategory> findByDescription(String description);

}
