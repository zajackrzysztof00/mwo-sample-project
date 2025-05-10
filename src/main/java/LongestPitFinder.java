import java.util.Date;
import java.util.List;

public class LongestPitFinder {
    public static LongestPit longestPitFinder(List<PitStop> pitStops) {
        int driverId = pitStops.getFirst().getDriver();
        double pitTime = pitStops.getFirst().getDuration();

        for (PitStop pitStop : pitStops) {
            if (pitTime > pitStop.getDuration()) {
                pitTime = pitStop.getDuration();
                driverId = pitStop.getDriver();
            }
        }

        return new LongestPit(driverId, pitTime);
    }
}
