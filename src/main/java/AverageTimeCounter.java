import java.util.List;

public class AverageTimeCounter {
    private List<PitStop> pitStops;

    public AverageTimeCounter(List<PitStop> pitStops) {
        this.pitStops = pitStops;
    }

    public double calc() {
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
