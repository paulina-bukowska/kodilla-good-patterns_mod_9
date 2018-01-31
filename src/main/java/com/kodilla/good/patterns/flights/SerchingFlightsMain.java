package com.kodilla.good.patterns.flights;

public class SerchingFlightsMain {
    public static void main(String[] args) {
        System.out.println(SearchingFlights.flightsFromCity(Cities.GDANSK));
        System.out.println("\n");
        System.out.println(SearchingFlights.flightsToCity(Cities.RZESZOW));
        System.out.println("\n");
        System.out.println(SearchingFlights.flightWithTransfer(Cities.GDANSK, Cities.WARSZAWA, Cities.RZESZOW));
    }
}
