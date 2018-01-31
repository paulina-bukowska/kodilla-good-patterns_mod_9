package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRepository {
    private static Set<Flight> flightsSet = new HashSet<>();

    public static Set<Flight> getFlightsSet() {
        flightsSet.add(new Flight(Cities.GDANSK, Cities.WROCLAW));
        flightsSet.add(new Flight(Cities.GDANSK, Cities.KRAKOW));
        flightsSet.add(new Flight(Cities.GDANSK, Cities.RZESZOW));
        flightsSet.add(new Flight(Cities.GDANSK, Cities.WARSZAWA));
        flightsSet.add(new Flight(Cities.WROCLAW, Cities.GDANSK));
        flightsSet.add(new Flight(Cities.WROCLAW, Cities.SZCZECIN));
        flightsSet.add(new Flight(Cities.RZESZOW, Cities.SZCZECIN));
        flightsSet.add(new Flight(Cities.SZCZECIN, Cities.WARSZAWA));
        flightsSet.add(new Flight(Cities.WARSZAWA, Cities.WROCLAW));
        flightsSet.add(new Flight(Cities.WARSZAWA, Cities.GDANSK));
        flightsSet.add(new Flight(Cities.WARSZAWA, Cities.SZCZECIN));
        flightsSet.add(new Flight(Cities.WARSZAWA, Cities.RZESZOW));
        flightsSet.add(new Flight(Cities.WARSZAWA, Cities.KRAKOW));
        flightsSet.add(new Flight(Cities.KRAKOW, Cities.WARSZAWA));
        flightsSet.add(new Flight(Cities.KRAKOW, Cities.WROCLAW));
        flightsSet.add(new Flight(Cities.KRAKOW, Cities.GDANSK));
        flightsSet.add(new Flight(Cities.KRAKOW, Cities.SZCZECIN));
        return flightsSet;
    }
}