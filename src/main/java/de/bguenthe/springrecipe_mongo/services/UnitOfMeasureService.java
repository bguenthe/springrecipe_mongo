package de.bguenthe.springrecipe_mongo.services;

import de.bguenthe.springrecipe_mongo.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
