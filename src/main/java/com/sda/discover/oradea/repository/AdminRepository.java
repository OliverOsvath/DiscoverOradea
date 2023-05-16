package com.sda.discover.oradea.repository;

import com.sda.discover.oradea.model.Admin;

import java.util.Optional;

public interface AdminRepository {

    Optional<Admin> findAdminById(Long id);

    Optional<Admin> findAdminByName(String email);

    Admin create(Admin admin);

    Admin update(Admin admin);

    void delete(Admin admin);
}
