package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
