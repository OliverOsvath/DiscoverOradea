package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Review;

import java.util.List;
import java.util.Optional;


public interface ReviewService {
    Review create(String comment, int score);

    void save(String guestFirstName,
              String guestLastName,
              String guestNationality,
              String reviewComment,
              int reviewScore);

    void delete(int id);

    List<Review> findAll();

    Optional<Review> findById(int id);
}
