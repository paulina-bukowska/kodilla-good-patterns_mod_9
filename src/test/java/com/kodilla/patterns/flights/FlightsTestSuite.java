package com.kodilla.patterns.flights;

import com.kodilla.good.patterns.flights.Cities;
import com.kodilla.good.patterns.flights.Flight;
import com.kodilla.good.patterns.flights.SearchingFlights;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightsTestSuite {
    @Test
    public void testSearchingFlights() {
        //Given & When
        List<Flight> flightsFromCity = SearchingFlights.flightsFromCity(Cities.GDANSK);
        List<Flight> flightsToCity = SearchingFlights.flightsToCity(Cities.RZESZOW);
        List<Flight> flightWithTransfer = SearchingFlights.flightWithTransfer(Cities.GDANSK, Cities.WARSZAWA, Cities.RZESZOW);

        //Then
        Assert.assertEquals(4, flightsFromCity.size());
        Assert.assertEquals(2, flightsToCity.size());
        Assert.assertEquals(2, flightWithTransfer.size());
    }
}
