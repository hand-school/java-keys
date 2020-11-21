package com.handtruth.lessons.lesson6.training.lab;

public class OrganisationAddress {
    private Integer index;
    private String city;
    private String street;
    private Integer house;

    public OrganisationAddress() {

    }

    public OrganisationAddress(Integer index, String city, String street, Integer house) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public void setIndex(Integer index) {
        if (index < 100000) {
           throw new
                   IllegalArgumentException("Invalid Index");
        } else {
            this.index = index;
        }
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

    public boolean removeIndex() {
        boolean isRemoved = this.index != null;
        this.index = null;
        return isRemoved;
    }

    public boolean removeCity() {
        boolean isRemoved = this.city != null;
        this.city = null;
        return isRemoved;
    }

    public boolean removeStreet() {
        boolean isRemoved = this.street != null;
        this.street = null;
        return isRemoved;
    }

    public boolean removeHouse() {
        boolean isRemoved = this.house != null;
        this.house = null;
        return isRemoved;
    }


    public void removeAll() {
        this.index = null;
        this.city = null;
        this.street = null;
        this.house = null;
    }

    @Override
    public String toString() {
        return "OrganisationAddress address : \n" + this.index + "\ngorod " + this.city + "\nulitsa " + this.street + "\ndom " + this.house;
    }
}
