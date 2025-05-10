package com.example;

import java.util.List;

public class LongestPitFinder {
    public static LongestPit longestPitFinder(List<PitStop> pitStops) {
        int driverId = pitStops.get(0).getDriver();
        double pitTime = pitStops.get(0).getDuration();

        for (PitStop pitStop : pitStops) {
            if (pitTime > pitStop.getDuration()) {
                pitTime = pitStop.getDuration();
                driverId = pitStop.getDriver();
            }
        }

        return new LongestPit(driverId, pitTime);
    }
}
