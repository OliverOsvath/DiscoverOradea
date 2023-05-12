package com.sda.discover.oradea.service;

import com.sda.discover.oradea.Model.Hotel;
import com.sda.discover.oradea.repository.HotelRepository;


import java.util.List;

public class HotelServiceImpl implements HotelService{
    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel getHotelById(Long id) {
        return hotelRepository.findById(id);
    }


    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }


    @Override
    public void createHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void updateHotel(Hotel hotel) {
        hotelRepository.update(hotel);
    }

    @Override
    public void deleteHotel(Long id) {

    }


}
