package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SearchingFlights {
    public static Set<Flight> flightsFromCity(String departureCity) {
        return FlightsRepository.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureCity() == departureCity)
                .collect(Collectors.toSet());
    }

    public static Set<Flight> flightsToCity(String arrivalCity) {
        return FlightsRepository.getFlightsSet().stream()
                .filter(flight -> flight.getArrivalCity() == arrivalCity)
                .collect(Collectors.toSet());
    }

    public static void flightWithTransfer (String departureCity, String transferCity, String arrivalCity) {
        Flight firstStep = new Flight(departureCity, transferCity);
        Flight secondStep = new Flight(transferCity, arrivalCity);

        if(flightsFromCity(departureCity).contains(firstStep) && flightsToCity(arrivalCity).contains(secondStep)) {
            System.out.println(firstStep);
            System.out.println("!!! transfer !!!");
            System.out.println(secondStep);
        }
    }
}
