package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, LocalDateTime timeOrder) {
        return false;
    }
}
