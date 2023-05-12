package com.sda.discover.oradea.Model;

public class Attraction {
    private Long id;
    private String name;
    private String address;
    private int openingHours;
    private String contact;
    private double adultPrice;
    private double priceForChildren;
    private double distance;

    public Attraction() {
    }

    public Attraction(String name, String address, int openingHours, String contact, double adultPrice, double priceForChildren, double distance) {
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
