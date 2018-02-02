package com.kodilla.good.patterns.flights;

public class SerchingFlightsMain {
    public static void main(String[] args) {
        System.out.println(SearchingFlights.flightsFromCity(City.GDANSK));
        System.out.println("\n");
        System.out.println(SearchingFlights.flightsToCity(City.RZESZOW));
        System.out.println("\n");
        System.out.println(SearchingFlights.flightsWithTransfer(City.GDANSK, City.WARSZAWA, City.RZESZOW));
        System.out.println("\n");
        System.out.println(SearchingFlights.flightFromCityToCityWithTransferMethod1(City.GDANSK, City.KRAKOW));
        System.out.println("\n");
        System.out.println(SearchingFlights.flightFromCityToCityWithTransferMethod2(City.GDANSK, City.KRAKOW));
    }
}
