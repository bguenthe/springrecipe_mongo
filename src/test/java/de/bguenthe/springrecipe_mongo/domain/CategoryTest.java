package de.bguenthe.springrecipe_mongo.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        category.setId("4");

        assertEquals((Long)4L, category.getId());
    }

    @Test
    public void getCategoryName() {
    }

    @Test
    public void getRecipes() {
    }
}