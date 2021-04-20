package com.company.lesson8;

public class Robot implements Activity {
    private String type;
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getType() {
        return type = "Робот";
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Робот " + name + " пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Робот " + name + " прыгнул");
    }

    @Override
    public boolean isGoTrack(DoIt obstacle) {
        int limit = Action.getAction(obstacle, maxRun, maxJump);
        boolean isWent = obstacle.doIt(limit);
        InformationDisplay.printInfoTrack(isWent, obstacle, getType(), getName(), limit);
        return isWent;
    }
}
