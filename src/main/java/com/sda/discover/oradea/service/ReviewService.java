package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.model.Review;

import java.util.List;
import java.util.Optional;


public interface ReviewService {
    Review create(String comment, int score);

    void save(Review review);

    void delete(int id);

    List<Review> findAll();
    Optional<Review> findById(int id);
}
