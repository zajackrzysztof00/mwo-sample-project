package com.example;

import java.util.List;

public class LapNumberFinder {

    //WRONG LOGIC
//    public static int findFirstPitStopLapNumber(List<PitStop> pitStops) {
//        int lapNumber = Integer.MAX_VALUE;
//        for (PitStop pitStop : pitStops) {
//            lapNumber = Math.min(lapNumber, pitStop.getLap());
//        }
//        return lapNumber;
//    }
//
//    public static int findLastPitStopLapNumber(List<PitStop> pitStops) {
//        int lapNumber = 0;
//        for (PitStop pitStop : pitStops) {
//            lapNumber = Math.max(lapNumber, pitStop.getLap());
//        }
//        return lapNumber;
//    }
}
