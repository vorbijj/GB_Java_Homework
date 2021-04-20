package com.company.lesson8;

public class Cat implements Activity {
    private String type;
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getType() {
        return type = "Кот";
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Кот " + name + " пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот " + name + " прыгнул");
    }

    @Override
    public boolean isGoTrack(DoIt obstacle) {
        int limit = Action.getAction(obstacle, maxRun, maxJump);
        boolean isWent = obstacle.doIt(limit);
        InformationDisplay.printInfoTrack(isWent, obstacle, getType(), getName(), limit);
        return isWent;
    }
}
