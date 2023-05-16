package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Admin;
import com.sda.discover.oradea.model.constant.UserRole;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface AdminService extends UserDetailsService {
    Admin createAdmin(String email, String password, UserRole userRole);

}
