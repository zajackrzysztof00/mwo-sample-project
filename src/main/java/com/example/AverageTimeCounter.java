package com.example;

import java.util.List;

public class AverageTimeCounter {
    public int totalTime = 0;

    public static double average(List<PitStop> pitStops) {
        if (pitStops == null || pitStops.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (PitStop p : pitStops) {
            sum += p.getDuration();
        }

        return sum / pitStops.size();


    }
}
