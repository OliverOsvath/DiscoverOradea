package com.sda.discover.oradea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotBlank(message = "Please input a name")
    @NotNull(message = "Please input a name")
    @Column(name = "name")
    private String name;
    @NotBlank(message = "Please input a address")
    @NotNull(message = "Please input a address")
    @Column(name = "address")
    private String address;
    @NotBlank(message = "Please input opening hours")
    @NotNull(message = "Please input opening hours")
    @Column(name = "opening_hours")
    private String openingHours;
    @Column(name = "contact")
    private String contact;
    @Column(name = "distance")
    private String distance;

    public Restaurant() {
    }

    public Restaurant(String name, String address, String openingHours, String contact, String distance) {
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
        this.contact = contact;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openingHours='" + openingHours + '\'' +
                ", contact='" + contact + '\'' +
                ", distance='" + distance + '\'' +
                '}';
    }
}
