package com.kodilla.patterns.flights;

import com.kodilla.good.patterns.flights.City;
import com.kodilla.good.patterns.flights.Flight;
import com.kodilla.good.patterns.flights.SearchingFlights;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightsTestSuite {
    @Test
    public void testSearchingFlights() {
        //Given & When
        List<Flight> flightsFromCity = SearchingFlights.flightsFromCity(City.GDANSK);
        List<Flight> flightsToCity = SearchingFlights.flightsToCity(City.RZESZOW);
        List<Flight> flightWithTransfer = SearchingFlights.flightWithTransfer(City.GDANSK, City.WARSZAWA, City.RZESZOW);
        List<List<Flight>> flightFromCityToCityWithTransfer = SearchingFlights.flightFromCityToCityWithTransfer(City.GDANSK, City.KRAKOW);

        //Then
        Assert.assertEquals(4, flightsFromCity.size());
        Assert.assertEquals(2, flightsToCity.size());
        Assert.assertEquals(2, flightWithTransfer.size());
        Assert.assertEquals(2, flightFromCityToCityWithTransfer.size());
    }
}