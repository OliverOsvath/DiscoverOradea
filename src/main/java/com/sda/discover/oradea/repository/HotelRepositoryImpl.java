package com.sda.discover.oradea.repository;


import com.sda.discover.oradea.model.Hotel;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository
public class HotelRepositoryImpl implements HotelRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Hotel> findHotelById(Long id) {
        return Optional.ofNullable(entityManager.find(Hotel.class, id));
    }

    @Override
    public List<Hotel> findAll() {
        TypedQuery<Hotel> query = entityManager.createQuery("select h from Hotel h", Hotel.class);
        return query.getResultList();
    }

    @Override
    public void create(Hotel hotel) {
        entityManager.persist(hotel);
    }

    @Override
    public void update(Hotel hotel) {
        entityManager.merge(hotel);
    }

    @Override
    public void delete(Long hotelId) {
        entityManager.remove(hotelId);
    }
}
