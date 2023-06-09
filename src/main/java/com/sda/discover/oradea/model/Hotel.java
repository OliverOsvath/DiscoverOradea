package com.sda.discover.oradea.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;


@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull(message = "Type a Name")
    @NotBlank(message = "Type a Name")
    @Column(name = "name")
    private String name;
    @NotNull(message = "Please type a address")
    @NotBlank(message = "Please type a address")
    @Column(name = "address")
    private String address;
    @NotNull(message = "Please enter contact details")
    @NotBlank(message = "Please enter contact details")
    @Column(name = "contact")
    private String contact;
    @NotNull(message = "Please enter phone number")
    @NotBlank(message = "Please enter phone number")
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "price_from")
    private Double priceFrom;

    @OneToMany(mappedBy = "hotel")
    private List<HotelPOI> hotelPOIs;


    public Hotel() {
    }

    public Hotel(String name, String address, String contact, String phoneNumber, Double priceFrom) {

        this.name = name;
        this.address = address;
        this.contact = contact;
        this.phoneNumber = phoneNumber;
        this.priceFrom = priceFrom;
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

    public String getContact() {

        return contact;
    }

    public void setContact(String contact) {

        this.contact = contact;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public Double getPriceFrom() {
        return priceFrom;
    }

    public void setPriceFrom(Double priceFrom) {
        this.priceFrom = priceFrom;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", priceFrom='" + priceFrom + '\'' +
                '}';
    }
}
