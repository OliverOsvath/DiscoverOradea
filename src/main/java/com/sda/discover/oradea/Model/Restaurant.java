package com.sda.discover.oradea.Model;

public class Restaurant {

    private Long id;
    private String name;
    private String address;
    private String openingHours;
    private String contact;
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
