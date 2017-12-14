package com.kodilla.patterns.challenges;

import com.kodilla.good.patterns.challenges.MovieStore;
import org.junit.*;

import java.util.List;
import java.util.Map;

public class MovieStoreTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void before(){
        testCounter++;
        System.out.println("Test Case #" + testCounter);
    }

    @Test
    public void testGetMovies() {
        //Given
        MovieStore movieStore = new MovieStore();
        Integer expectedMapSize = 3;

        //When
        Map<String, List<String>> booksTitlesWithTranslations = movieStore.getMovies();
        Integer mapSize = booksTitlesWithTranslations.size();

        //Then
        Assert.assertEquals(expectedMapSize, mapSize);
    }

    @Test
    public void testDisplayTitlesInOneLine() {
        //Given
        MovieStore movieStore = new MovieStore();
        String expectedTag = "Żelazny Człowiek!Iron Man!Mściciele!Avengers!Błyskawica!Flash!";

        //When
        String mergedTitles = movieStore.displayTitlesInOneLine();

        //Then
        Assert.assertEquals(expectedTag, mergedTitles);
    }
}