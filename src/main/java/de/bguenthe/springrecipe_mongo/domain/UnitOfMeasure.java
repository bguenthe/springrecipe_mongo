package de.bguenthe.springrecipe_mongo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class UnitOfMeasure {
    @Id
    String id;
    private String description;
}
