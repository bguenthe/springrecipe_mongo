package de.bguenthe.springrecipe_mongo.services;

import de.bguenthe.springrecipe_mongo.commands.IngredientCommand;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jt on 6/27/17.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(String recipeId, String ingredientId);

    @Transactional
    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(String id);
}