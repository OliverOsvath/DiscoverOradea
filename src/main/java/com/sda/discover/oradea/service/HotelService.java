package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface HotelService{
    Hotel createHotel(Hotel hotel);
    Hotel updateHotel(Long hotelId, Hotel hotel);
    boolean deleteHotel(Long hotelId);

    Optional<Hotel> getHotelById(Long hotelId);

    List<Hotel> getAllHotels();
}
