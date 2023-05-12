package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.Model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    Hotel findById(Long id);
    List<Hotel> findAll();
    void create(Hotel hotel);
    void update(Hotel hotel);
    void deleteById(Long id);

    void delete(Long id);
}
