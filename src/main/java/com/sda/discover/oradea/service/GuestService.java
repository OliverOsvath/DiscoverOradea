package com.sda.discover.oradea.service;


import com.sda.discover.oradea.model.Guest;

import java.util.List;
import java.util.Optional;

public interface GuestService {

    Guest create(String firstName, String lastName, String nationality);

    void save(Guest guest);

    List<Guest> findAll();

    Optional<Guest> findById(int id);

    void delete(int id);
}
