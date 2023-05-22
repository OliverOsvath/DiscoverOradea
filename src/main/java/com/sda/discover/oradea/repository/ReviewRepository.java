package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
