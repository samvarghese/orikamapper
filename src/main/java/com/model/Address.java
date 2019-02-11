package com.model;

public class Address {

    private String houseName;
    private String city;
    private String place;
    private long zipCode;

    public Address(String houseName, String city, String place, long zipCode) {
        this.houseName = houseName;
        this.city = city;
        this.place = place;
        this.zipCode = zipCode;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseName='" + houseName + '\'' +
                ", city='" + city + '\'' +
                ", place='" + place + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
