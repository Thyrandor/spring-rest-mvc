package de.nku.springrestmvc.services;

import de.nku.springrestmvc.model.Beer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerById(UUID uuid) {
        log.info("getBeerById was called.");

        return Beer.builder().uuid(uuid)
                .version(1)
                .beerName("Oberberg Bräu")
                .quantityOnHand(100)
                .upc("123")
                .price(new BigDecimal("4.10"))
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
