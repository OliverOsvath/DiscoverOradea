package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.model.Hotel;
import java.util.List;
import java.util.Optional;

public interface HotelRepository{

    Optional<Hotel> findHotelById(Long id);

    List<Hotel> findAll();

    void create(Hotel hotel);
    void update(Hotel hotel);
    void delete(Long hotelId);

}
