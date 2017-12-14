package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceMain {
    public static void main(String[] args) {
        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new SmsService(), new BookOrderService(), new BookOrderRepository());
        productOrderService.process(orderRequest);
    }
}
