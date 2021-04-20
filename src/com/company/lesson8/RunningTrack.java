package com.company.lesson8;

public class RunningTrack implements DoIt {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    @Override
    public int distance() {
        return length;
    }

    @Override
    public boolean doIt(int limit) {
        return limit >= length;
    }

    @Override
    public MarkObstacle definingObstacle() {
        return MarkObstacle.RUN;
    }
}
