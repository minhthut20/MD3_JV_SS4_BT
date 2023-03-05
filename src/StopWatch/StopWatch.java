package StopWatch;

import java.util.Date;

public class StopWatch {
    Date date = new Date();
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = date.getTime();
    }

    public void stop () {
        endTime= date.getTime();
    }

    public long getElapsedTime() {
        long elapsedTime = getEndTime() - getStartTime();
        return elapsedTime;
    }
}
