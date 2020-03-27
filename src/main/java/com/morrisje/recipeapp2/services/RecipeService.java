package com.morrisje.recipeapp2.services;

import com.morrisje.recipeapp2.commands.RecipeCommand;
import com.morrisje.recipeapp2.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand findCommandById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
