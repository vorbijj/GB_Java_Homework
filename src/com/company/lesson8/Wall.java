package com.company.lesson8;

public class Wall implements DoIt {

    private int height;


    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int distance() {
        return height;
    }

    @Override
    public boolean doIt(int limit) {
        return limit >= height;
    }

    @Override
    public MarkObstacle definingObstacle() {
        return MarkObstacle.JUMP;
    }
}
