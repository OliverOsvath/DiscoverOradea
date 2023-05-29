package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Restaurant;
import com.sda.discover.oradea.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService{

    private final RestaurantRepository restaurantRepository;

    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }


    @Override
    public Restaurant create(String name, String address, String openingHours, String contact) {
        Restaurant restaurant = new Restaurant(name, address,openingHours, contact);
        return restaurantRepository.save(restaurant);
    }
    @Override
    public List<Restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> findById(int id) {
        return restaurantRepository.findById(id);
    }

    @Override
    public List<Restaurant> search(String value) {
        List<Restaurant> searchResult = new ArrayList<>();
        for(Restaurant restaurant : searchResult){
            if(restaurant.getName().contains(value)){
                searchResult.add(restaurant);
            }
        }
        return searchResult;
    }

    @Override
    public void save(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    @Override
    public void delete(int id) {
        restaurantRepository.deleteById(id);
    }

    @Override
    public List<Restaurant> showAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
