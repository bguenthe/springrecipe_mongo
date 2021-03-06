package de.bguenthe.springrecipe_mongo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Getter
@Setter
@Document
public class Category {
    @Id
    String id;
    String categoryName;

    @DBRef
    private Set<Recipe> recipes;
}
