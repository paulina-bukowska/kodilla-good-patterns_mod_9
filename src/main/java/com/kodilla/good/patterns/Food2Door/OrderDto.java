package com.kodilla.good.patterns.Food2Door;

public class OrderDto {
    private Customer customer;
    private boolean confirm;

    public OrderDto(Customer customer, boolean isOrdered) {
        this.customer = customer;
        this.confirm = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean getConfirm() {
        return confirm;
    }
}