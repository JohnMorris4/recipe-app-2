package com.morrisje.recipeapp2.services;

import com.morrisje.recipeapp2.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
