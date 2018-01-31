package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchingFlights {
    public static List<Flight> flightsFromCity(Cities departureCity) {
        return FlightsRepository.getFlightsSet().stream()
                .filter(flight -> flight.getDepartureCity() == departureCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> flightsToCity(Cities arrivalCity) {
        return FlightsRepository.getFlightsSet().stream()
                .filter(flight -> flight.getArrivalCity() == arrivalCity)
                .collect(Collectors.toList());
    }

    public static List<Flight> flightWithTransfer (Cities departureCity, Cities transferCity, Cities arrivalCity) {
        Flight firstStep = new Flight(departureCity, transferCity);
        Flight secondStep = new Flight(transferCity, arrivalCity);
        List<Flight> allSteps = new ArrayList<>();

        if(FlightsRepository.getFlightsSet().contains(firstStep) && FlightsRepository.getFlightsSet().contains(secondStep)) {
            allSteps.add(firstStep);
            allSteps.add(secondStep);
        } else {
            System.out.println("Connection you are searching doesn't exist.");
        }
        return allSteps;
    }
}
