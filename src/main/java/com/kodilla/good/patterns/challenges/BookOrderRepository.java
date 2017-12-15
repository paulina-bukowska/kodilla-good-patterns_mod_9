package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(OrderRequest orderRequest) {
        System.out.println("Writing this order to the database");
        return true;
    }
}
