package com.sda.discover.oradea.service;

import com.sda.discover.oradea.model.Admin;
import com.sda.discover.oradea.model.constant.UserRole;
import com.sda.discover.oradea.repository.AdminRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{


    private final AdminRepository adminRepository;

    private final BCryptPasswordEncoder passwordEncoder;
    public AdminServiceImpl(AdminRepository adminRepository, BCryptPasswordEncoder passwordEncoder) {
        this.adminRepository = adminRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Admin createAdmin(String email, String password, UserRole userRole) {
        Admin admin = new Admin(email, passwordEncoder.encode(password), userRole);
        adminRepository.save(admin);
        return new Admin(email, "secret", userRole);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Admin admin = adminRepository.findByEmail(email)
                .orElseThrow( () -> new UsernameNotFoundException("Invalid username or password"));
        return new org.springframework.security.core.userdetails.User(
                admin.getEmail(),
                admin.getPassword(),
                List.of(new SimpleGrantedAuthority(admin.getUserRole().name()))

        );
    }

}
