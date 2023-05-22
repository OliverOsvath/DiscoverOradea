package com.sda.discover.oradea.service;


import com.sda.discover.oradea.model.Attraction;

import java.util.List;
import java.util.Optional;

public interface AttractionService {

    Attraction create( String name,
                       String address,
                       String openingHours,
                       String contact,
                       Double adultPrice,
                       Double priceForChildren);

    void save(Attraction attraction);

    List<Attraction> findAll();
    Optional<Attraction> findById(int id);

    void delete(int id);
}
