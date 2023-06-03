package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Restaurant;

import java.util.List;
import java.util.Optional;


public interface RestaurantService {
    Restaurant create(String name, String address, String openingHours, String contact);

    void save(Restaurant restaurant);

    void delete(int id);

    List<Restaurant> showAllRestaurants();

    List<Restaurant> findAll();

    Optional<Restaurant> findById(int id);

    List<Restaurant> search(String value);
}
