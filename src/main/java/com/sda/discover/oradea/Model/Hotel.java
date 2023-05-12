package com.sda.discover.oradea.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Hotel {
    @Id
    private Long id;
    private String name;
    private String address;
    private String contact;
    private String phoneNumber;

    public Hotel() {
    }

    public Hotel( String name, String address, String contact, String phoneNumber) {

        this.name = name;
        this.address = address;
        this.contact = contact;
        this.phoneNumber = phoneNumber;
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

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
