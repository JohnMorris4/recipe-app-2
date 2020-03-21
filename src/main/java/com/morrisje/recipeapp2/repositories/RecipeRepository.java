package com.morrisje.recipeapp2.repositories;

import com.morrisje.recipeapp2.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
