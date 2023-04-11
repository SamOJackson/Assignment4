package com.example.assignment4;

public class Person {
    private String personName;
    private String address;
    private String card;

    public Person(String personName, String address, String card) {
        this.personName = personName;
        this.address = address;
        this.card = card;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
