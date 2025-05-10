package com.example;

import java.util.List;

public class PitsCounter {
    private List<PitStop> pitStops;

    public PitsCounter(List<PitStop> pitStops) {
        this.pitStops = pitStops;
    }

    public int calc() {
        int count = 0;
        for (PitStop p : pitStops) {
                count++;
        }
        return count;
    }

}
