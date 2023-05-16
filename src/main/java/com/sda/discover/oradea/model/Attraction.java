package com.sda.discover.oradea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@Entity
@Table(name = "attraction")
public class Attraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull(message = "Type a name")
    @NotBlank(message = "Type a name")
    @Column(name = "name")
    private String name;
    @NotNull(message = "Please type a address")
    @NotBlank(message = "Please type a address")
    @Column(name = "address")
    private String address;
    @Column(name = "opening_hours")
    private int openingHours;
    @Column(name = "contact")
    private String contact;
    @Column(name = "adult_price")
    private double adultPrice;
    @Column(name = "price_for_children")
    private double priceForChildren;
    @Column(name = "distance")
    private double distance;

    public Attraction() {
    }

    public Attraction(
            String name,
            String address,
            int openingHours,
            String contact,
            double adultPrice,
            double priceForChildren,
            double distance
    ) {
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
        this.contact = contact;
        this.adultPrice = adultPrice;
        this.priceForChildren = priceForChildren;
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

    public int getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(int openingHours) {
        this.openingHours = openingHours;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public double getPriceForChildren() {
        return priceForChildren;
    }

    public void setPriceForChildren(double priceForChildren) {
        this.priceForChildren = priceForChildren;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openingTimes=" + openingHours +
                ", contact='" + contact + '\'' +
                ", adultPrice=" + adultPrice +
                ", priceForChildren=" + priceForChildren +
                ", distance=" + distance +
                '}';
    }
}
