package com.morrisje.recipeapp2.repositories;

import com.morrisje.recipeapp2.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
