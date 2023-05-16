package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {


}
