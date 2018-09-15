package de.bguenthe.springrecipe_mongo.repositories;

import de.bguenthe.springrecipe_mongo.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface  RecipeRepository extends CrudRepository<Recipe, String> {
}
