package de.nku.springrestmvc.services;

import de.nku.springrestmvc.model.Beer;
import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID uuid);
}
