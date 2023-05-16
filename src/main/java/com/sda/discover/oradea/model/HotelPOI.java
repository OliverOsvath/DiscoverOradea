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

    @Column(name = "attraction_distance")
    private String attractionDistance;

    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @Column(name = "restaurant_distance")
    private String restaurantDistance;

    public HotelPOI() {
    }

    public HotelPOI(String attractionDistance, String restaurantDistance) {
        this.attractionDistance = attractionDistance;
        this.restaurantDistance = restaurantDistance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttractionDistance() {
        return attractionDistance;
    }

    public void setAttractionDistance(String attractionDistance) {
        this.attractionDistance = attractionDistance;
    }

    public String getRestaurantDistance() {
        return restaurantDistance;
    }

    public void setRestaurantDistance(String restaurantDistance) {
        this.restaurantDistance = restaurantDistance;
    }
}
