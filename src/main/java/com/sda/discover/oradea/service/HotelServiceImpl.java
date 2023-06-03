package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Hotel;
import com.sda.discover.oradea.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }


    @Override
    public Hotel create(String name, String address, String contact, String phoneNumber, Double priceFrom) {
        Hotel hotel = new Hotel(name, address, contact, phoneNumber, priceFrom);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> findById(int id) {
        return hotelRepository.findById(id);
    }

    @Override
    public List<Hotel> search(String value) {
        List<Hotel> searchResult = new ArrayList<>();
        for (Hotel hotel : hotelRepository.findAll()) {
            if (hotel.getName().contains(value)) {
                searchResult.add(hotel);
            }
        }
        return searchResult;
    }

    @Override
    public void save(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public void delete(int id) {
        hotelRepository.deleteById(id);
    }
}
