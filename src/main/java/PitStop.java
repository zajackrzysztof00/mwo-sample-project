import java.util.Date;

public class PitStop {
    private int sessionKey;
    private int meetingKey;
    private Date date;
    private int driver;
    private double duration;
    private int lap;

    public PitStop(int sessionKey, int meetingKey, Date date, int driver, double duration, int lap) {
        this.sessionKey = sessionKey;
        this.meetingKey = meetingKey;
        this.date = date;
        this.driver = driver;
        this.duration = duration;
        this.lap = lap;
    }

    public int getSessionKey() {
        return sessionKey;
    }

    public int getMeetingKey() {
        return meetingKey;
    }

    public Date getDate() {
        return date;
    }

    public int getDriver() {
        return driver;
    }

    public double getDuration() {
        return duration;
    }

    public int getLap() {
        return lap;
    }
}
