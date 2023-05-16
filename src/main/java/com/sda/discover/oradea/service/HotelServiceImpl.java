package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel createHotel(Hotel hotel) {
        hotelRepository.create(hotel);
        return hotel;
    }

    @Override
    public Hotel updateHotel(Long hotelId, Hotel hotel) {
        hotelRepository.update(hotel);
        return hotel;
    }

    @Override
    public boolean deleteHotel(Long hotelId) {
        hotelRepository.delete(hotelId);
        return false;
    }

    @Override
    public Optional<Hotel> getHotelById(Long hotelId) {
        Optional<Hotel> foundHotel = hotelRepository.findHotelById(hotelId);
        return foundHotel;
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }
}
