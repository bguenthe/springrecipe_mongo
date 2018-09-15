package de.bguenthe.springrecipe_mongo.repositories;

import de.bguenthe.springrecipe_mongo.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
