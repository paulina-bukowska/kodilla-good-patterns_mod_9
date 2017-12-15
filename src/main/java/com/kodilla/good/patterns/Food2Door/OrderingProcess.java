package com.kodilla.good.patterns.Food2Door;

public class OrderingProcess {
    private Shop shop;
    private Deliverer deliverer;

    public OrderDto order(OrderDto orderDto) {
        if(orderDto.getConfirm() == true) {
            shop.process(deliverer);
            System.out.println("Deliver the order to: " + orderDto.getCustomer().getAdress() + " In case of any problems with delivery please inform " + orderDto.getCustomer().getPhoneNum());
            return new OrderDto(orderDto.getCustomer(), true);
        }
        else {
            return new OrderDto(orderDto.getCustomer(), false);
        }
    }
}
