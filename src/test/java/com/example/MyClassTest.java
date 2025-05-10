package com.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



public class MyClassTest {

    private static List<PitStop> pitStops;

    @BeforeAll
    public static void setUp() {
        pitStops = new ArrayList<>();
        pitStops.add(new PitStop(10, 10, LocalDate.now(), 5, 30, 1));
        pitStops.add(new PitStop(10, 10, LocalDate.now(), 6, 35, 2));
        pitStops.add(new PitStop(10, 10, LocalDate.now(), 7, 37, 3));
        pitStops.add(new PitStop(10, 10, LocalDate.now(), 8, 43, 4));
        pitStops.add(new PitStop(10, 10, LocalDate.now(), 9, 45, 5));
        pitStops.add(new PitStop(10, 10, LocalDate.now(), 10, 60, 6));
        pitStops.add(new PitStop(10, 10, LocalDate.now(), 11, 70, 7));
    }

    @Test
    public void testAverageTime() {
        Assertions.assertEquals(45.7142857, AverageTimeCounter.average(pitStops), 0.2);
    }

}
