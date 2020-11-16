package com.handtruth.lessons.lesson6.training;

public class Organisation {
    public Integer index;
    public String city;
    public String street;
    public Integer house;

    public Organisation(Integer index, String city, String street, Integer house) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public void removeAll() {
        this.index = 0;
        this.city = "";
        this.street = "";
        this.house = 0;
    }

    @Override
    public String toString() {
        return "Organisation address : \n" + this.index + "\ngorod " + this.city + "\nulitsa " + this.street + "\ndom " + this.house;
    }
}
