package com.morrisje.recipeapp2.services;

import com.morrisje.recipeapp2.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipies();
}
