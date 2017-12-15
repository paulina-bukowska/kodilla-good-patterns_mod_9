package com.kodilla.good.patterns.Food2Door;

public class OrderingProcessMain {
    public static void main(String[] args) {
        Shop extraFoodShop = new ExtraFoodShop();

        Customer annGreenwood = new Customer("Ann", "Greenwood");
        OrderDto orderannGreenwood = new OrderDto(annGreenwood,true);
        Deliverer deliverer = new Deliverer("Extra Food Shop", "milk", 2.5);

        OrderingProcess orderingProcess = new OrderingProcess();
        orderingProcess.order(orderannGreenwood);
    }
}
