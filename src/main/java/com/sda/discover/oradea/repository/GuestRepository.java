package com.sda.discover.oradea.repository;




import com.sda.discover.oradea.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
}
