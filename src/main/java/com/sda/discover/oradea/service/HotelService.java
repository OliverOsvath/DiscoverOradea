package com.sda.discover.oradea.service;

import com.sda.discover.oradea.Model.Hotel;

import java.util.List;

public interface HotelService {
    Hotel getHotelById(Long id);

    List<Hotel> getAllHotels();
    void createHotel(Hotel hotel);
    void updateHotel(Hotel hotel);

    void deleteHotel(Long id);
}
