package de.bguenthe.springrecipe_mongo.services;

import de.bguenthe.springrecipe_mongo.commands.RecipeCommand;
import de.bguenthe.springrecipe_mongo.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String ld);

    RecipeCommand findCommandById(String ld);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String id);
}
