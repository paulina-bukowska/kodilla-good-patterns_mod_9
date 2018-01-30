package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsRepository {

    public static Set<Flight> getFlightsSet() {
        final Set<Flight> theSet = new HashSet<>();
        theSet.add(new Flight("Gdansk", "Wroclaw"));
        theSet.add(new Flight("Gdansk", "Krakow"));
        theSet.add(new Flight("Gdansk", "Rzeszow"));
        theSet.add(new Flight("Gdansk", "Warszawa"));
        theSet.add(new Flight("Wroclaw", "Gdansk"));
        theSet.add(new Flight("Wroclaw", "Szczecin"));
        theSet.add(new Flight("Rzeszow", "Szczecin"));
        theSet.add(new Flight("Szczecin", "Warszawa"));
        theSet.add(new Flight("Warszawa", "Wroclaw"));
        theSet.add(new Flight("Warszawa", "Gdansk"));
        theSet.add(new Flight("Warszawa", "Szczecin"));
        theSet.add(new Flight("Warszawa", "Rzeszow"));
        theSet.add(new Flight("Warszawa", "Krakow"));
        theSet.add(new Flight("Krakow", "Warszawa"));
        theSet.add(new Flight("Krakow", "Wroclaw"));
        theSet.add(new Flight("Krakow", "Gdansk"));
        theSet.add(new Flight("Krakow", "Szczecin"));
        return new HashSet<Flight>(theSet);
    }
}
