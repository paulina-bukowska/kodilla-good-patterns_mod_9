package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetrieve {
    public OrderRequest retrieve() {
        User user = new User("Joel", "Fleischman");
        LocalDateTime timeOrder = LocalDateTime.of(2017, 12, 14, 14, 27, 15);

        return new OrderRequest(user, timeOrder);
    }
}
