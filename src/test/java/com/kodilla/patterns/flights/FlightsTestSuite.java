package com.kodilla.patterns.flights;

import com.kodilla.good.patterns.flights.City;
import com.kodilla.good.patterns.flights.Flight;
import com.kodilla.good.patterns.flights.SearchingFlights;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FlightsTestSuite {
    @Test
    public void testSearchingFlights() {
        //Given & When
        List<Flight> flightsFromCity = SearchingFlights.flightsFromCity(City.GDANSK);
        Flight flight1 = flightsFromCity.get(0);
        Flight flight2 = flightsFromCity.get(1);
        Flight flight3 = flightsFromCity.get(2);
        Flight flight4 = flightsFromCity.get(3);

        List<Flight> flightsToCity = SearchingFlights.flightsToCity(City.RZESZOW);
        Flight flight5 = flightsToCity.get(0);
        Flight flight6 = flightsToCity.get(1);

        List<Flight> flightsWithTransfer = SearchingFlights.flightsWithTransfer(City.GDANSK, City.WARSZAWA, City.RZESZOW);
        Flight flight7 = flightsWithTransfer.get(0);
        Flight flight8 = flightsWithTransfer.get(1);

        List<List<Flight>> flightFromCityToCityWithTransferMethod1 = SearchingFlights.flightFromCityToCityWithTransferMethod1(City.GDANSK, City.KRAKOW);
        Flight flight9 = flightFromCityToCityWithTransferMethod1.get(0).get(0);
        List<Flight> list1 = new ArrayList<>();
        list1.add(flight9);

        Flight flight10 = flightFromCityToCityWithTransferMethod1.get(1).get(0);
        Flight flight11 = flightFromCityToCityWithTransferMethod1.get(1).get(1);
        List<Flight> list2 = new ArrayList<>();
        list2.add(flight10);
        list2.add(flight11);

        List<List<Flight>> flightFromCityToCityWithTransferMethod2 = SearchingFlights.flightFromCityToCityWithTransferMethod2(City.GDANSK, City.KRAKOW);
        Flight flight12 = flightFromCityToCityWithTransferMethod2.get(0).get(0);
        List<Flight> list3 = new ArrayList<>();
        list3.add(flight12);

        Flight flight13 = flightFromCityToCityWithTransferMethod2.get(1).get(0);
        Flight flight14 = flightFromCityToCityWithTransferMethod2.get(1).get(1);
        List<Flight> list4 = new ArrayList<>();
        list4.add(flight13);
        list4.add(flight14);

        //Then
        Assert.assertEquals(4, flightsFromCity.size());
        Assert.assertTrue(flightsFromCity.contains(flight1));
        Assert.assertTrue(flightsFromCity.contains(flight2));
        Assert.assertTrue(flightsFromCity.contains(flight3));
        Assert.assertTrue(flightsFromCity.contains(flight4));

        Assert.assertEquals(2, flightsToCity.size());
        Assert.assertTrue(flightsToCity.contains(flight5));
        Assert.assertTrue(flightsToCity.contains(flight6));

        Assert.assertEquals(2, flightsWithTransfer.size());
        Assert.assertTrue(flightsWithTransfer.contains(flight7));
        Assert.assertTrue(flightsWithTransfer.contains(flight8));

        Assert.assertEquals(2, flightFromCityToCityWithTransferMethod1.size());
        Assert.assertTrue(flightFromCityToCityWithTransferMethod1.contains(list1));
        Assert.assertTrue(flightFromCityToCityWithTransferMethod1.contains(list2));

        Assert.assertEquals(2, flightFromCityToCityWithTransferMethod2.size());
        Assert.assertTrue(flightFromCityToCityWithTransferMethod2.contains(list3));
        Assert.assertTrue(flightFromCityToCityWithTransferMethod2.contains(list4));
    }
}