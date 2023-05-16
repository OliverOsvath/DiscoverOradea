package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.model.Admin;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

public class AdminRepositoryImpl implements AdminRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Optional<Admin> findAdminById(Long id) {
        return Optional.ofNullable(entityManager.find(Admin.class, id));
    }

    @Override
    public Optional<Admin> findAdminByName(String email) {
        String queryStr = "SELECT a FROM Admin a WHERE a.email = :email";
        return entityManager.createQuery(queryStr, Admin.class)
                .setParameter("email", email)
                .getResultList()
                .stream()
                .findFirst();
    }

    @Override
    public Admin create(Admin admin) {
        entityManager.persist(admin);
        return admin;
    }

    @Override
    public Admin update(Admin admin) {
        return entityManager.merge(admin);
    }

    @Override
    public void delete(Admin admin) {
        entityManager.remove(admin);
    }
}
