package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;



public interface HotelService{
    Hotel create(String name, String address, String contact, String phoneNumber, Double priceFrom);
}
