package com.dato;

public class AddressDto {

    private String house;
    private String city;
    private String place;
    private long zipCode;
    
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
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
        return "AddressDto{" +
                "houseName='" + house + '\'' +
                ", city='" + city + '\'' +
                ", place='" + place + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
