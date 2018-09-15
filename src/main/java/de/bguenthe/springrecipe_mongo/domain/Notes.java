package de.bguenthe.springrecipe_mongo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
public class Notes {
    @Id
    private String id;
    private Recipe recipe;
    private String recipeNotes;
}