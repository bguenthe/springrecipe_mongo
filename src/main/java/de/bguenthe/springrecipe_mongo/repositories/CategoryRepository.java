package de.bguenthe.springrecipe_mongo.repositories;

import de.bguenthe.springrecipe_mongo.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, String> {
    Optional<Category> findByCategoryName(String categoryName);
}
