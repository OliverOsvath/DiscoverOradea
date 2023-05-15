package com.sda.discover.oradea.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel_poi")
public class HotelPOI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "attraction_id")
    private Attraction attraction;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public HotelPOI() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HotelPOI{" +
                "id=" + id +
                '}';
    }
}
