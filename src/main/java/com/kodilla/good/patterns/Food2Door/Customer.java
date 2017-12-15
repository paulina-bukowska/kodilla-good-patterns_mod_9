package com.kodilla.good.patterns.Food2Door;

public class Customer {
    private String name;
    private String surname;
    private String phoneNum;
    private String adress;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getAdress() {
        return adress;
    }
}
