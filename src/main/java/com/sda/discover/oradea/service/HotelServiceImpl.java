package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Hotel create(String name, String address, String contact, String phoneNumber, Double priceFrom) {
        Hotel hotel = new Hotel(name, address, contact, phoneNumber, priceFrom);
        return hotelRepository.save(hotel);
    }
}
