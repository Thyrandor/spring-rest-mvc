package de.nku.springrestmvc.controller;

import de.nku.springrestmvc.model.Beer;
import de.nku.springrestmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID uuid) {
        log.info("getBeerById was called.");

        return beerService.getBeerById(uuid);
    }
}
