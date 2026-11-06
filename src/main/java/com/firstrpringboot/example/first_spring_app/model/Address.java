package com.firstrpringboot.example.first_spring_app.model;

public class Address {

    private int doorNumber;
    private String streetName;
    private String city;

    public Address() {
    }

    public Address(int doorNumber, String streetName, String city) {
        this.doorNumber = doorNumber;
        this.streetName = streetName;
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNumber=" + doorNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}