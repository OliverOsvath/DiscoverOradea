package com.sda.discover.oradea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


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
    private String openingHours;
    @Column(name = "contact")
    private String contact;
    @Column(name = "adult_price")
    private Double adultPrice;
    @Column(name = "price_for_children")
    private Double priceForChildren;


    public Attraction() {
    }

    public Attraction(
            String name,
            String address,
            String openingHours,
            String contact,
            Double adultPrice,
            Double priceForChildren
    ) {
        this.name = name;
        this.address = address;
        this.openingHours = openingHours;
        this.contact = contact;
        this.adultPrice = adultPrice;
        this.priceForChildren = priceForChildren;

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

    public Double getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(Double adultPrice) {
        this.adultPrice = adultPrice;
    }

    public Double getPriceForChildren() {
        return priceForChildren;
    }

    public void setPriceForChildren(Double priceForChildren) {
        this.priceForChildren = priceForChildren;
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
                '}';
    }
}
