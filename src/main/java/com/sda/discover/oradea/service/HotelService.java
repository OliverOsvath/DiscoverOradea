package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface HotelService{
    Hotel create(String name, String address, String contact, String phoneNumber, Double priceFrom);

    void save(Hotel hotel);

    void delete(int id);

    List<Hotel> findAll();
    Optional<Hotel> findById(int id);

    List<Hotel> search(String value);

}
