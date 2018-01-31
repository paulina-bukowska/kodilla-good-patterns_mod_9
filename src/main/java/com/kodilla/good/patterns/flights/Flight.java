package com.kodilla.good.patterns.flights;

public class Flight {
    private Cities departureCity;
    private Cities arrivalCity;

    public Flight(Cities departureCity, Cities arrivalCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public Cities getDepartureCity() {
        return departureCity;
    }

    public Cities getArrivalCity() {
        return arrivalCity;
    }

    @Override
    public String toString() {
        return departureCity + " -> " + arrivalCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!departureCity.equals(flight.departureCity)) return false;
        return arrivalCity.equals(flight.arrivalCity);
    }

    @Override
    public int hashCode() {
        int result = departureCity.hashCode();
        result = 31 * result + arrivalCity.hashCode();
        return result;
    }
}
