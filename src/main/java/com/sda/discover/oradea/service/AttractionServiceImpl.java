package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Attraction;
import com.sda.discover.oradea.repository.AttractionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttractionServiceImpl implements AttractionService{

    private final AttractionRepository attractionRepository;

    public AttractionServiceImpl(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @Override
    public Attraction create(String name, String address, String openingHours, String contact, Double adultPrice, Double priceForChildren) {
        Attraction attraction = new Attraction(name, address, openingHours, contact, adultPrice, priceForChildren);
        return attractionRepository.save(attraction);
    }

    @Override
    public void save(Attraction attraction) {
        attractionRepository.save(attraction);
    }

    @Override
    public List<Attraction> findAll() {
        return attractionRepository.findAll();
    }

    @Override
    public Optional<Attraction> findById(int id) {
        return attractionRepository.findById(id);
    }

    @Override
    public void delete(int id){
        attractionRepository.deleteById(id);
    }
    @Override
    public List<Attraction> showAllAttractions() {
        return attractionRepository.findAll();
    }
}
