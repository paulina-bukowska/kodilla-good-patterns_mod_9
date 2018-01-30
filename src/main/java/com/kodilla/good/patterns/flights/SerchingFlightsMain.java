package com.kodilla.good.patterns.flights;

public class SerchingFlightsMain {
    public static void main(String[] args) {
        System.out.println(SearchingFlights.flightsFromCity("Gdansk"));
        System.out.println("\n");
        System.out.println(SearchingFlights.flightsToCity("Rzeszow"));
        System.out.println("\n");
        SearchingFlights.flightWithTransfer("Gdansk", "Warszawa", "Rzeszow");
    }
}
