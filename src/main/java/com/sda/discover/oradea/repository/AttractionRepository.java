package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.model.Attraction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttractionRepository extends JpaRepository<Attraction, Integer> {
}
