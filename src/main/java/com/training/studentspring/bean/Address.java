package com.training.studentspring.bean;

public class Address {
    public String getBuilding() {
        return building;
    }

    public Address(String building, String city, int pincode) {
        this.building = building;
        this.city = city;
        this.pincode = pincode;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    private String building;
    private String city;
    private int pincode;

    @Override
    public String toString() {
        return "Address{" +
                "building='" + building + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
