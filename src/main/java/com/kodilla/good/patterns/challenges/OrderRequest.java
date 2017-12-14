package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime timeOrder;

    public OrderRequest(User user, LocalDateTime timeOrder) {
        this.user = user;
        this.timeOrder = timeOrder;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTimeOrder() {
        return timeOrder;
    }
}
