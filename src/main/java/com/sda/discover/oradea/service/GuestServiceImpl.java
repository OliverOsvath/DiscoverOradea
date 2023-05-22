package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Guest;
import com.sda.discover.oradea.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    public GuestServiceImpl(GuestRepository guestRepository) {
        this.guestRepository = guestRepository;
    }

    @Override
    public Guest create(String firstName, String lastName, String nationality) {
        Guest guest = new Guest(firstName, lastName, nationality);
        return guestRepository.save(guest);
    }

    @Override
    public void save(Guest guest) {
        guestRepository.save(guest);
    }

    @Override
    public List<Guest> findAll() {
        return guestRepository.findAll();
    }

    @Override
    public Optional<Guest> findById(int id) {
        return guestRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        guestRepository.deleteById(id);
    }
}
