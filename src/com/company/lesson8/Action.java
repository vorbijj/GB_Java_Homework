package com.company.lesson8;

public class Action {

    public static int getAction(DoIt obstacle, int maxRun, int maxJump) {
        int act = 0;

        switch (obstacle.definingObstacle()) {
            case RUN:
//                System.out.println("Действие - бег");
                act = maxRun;
                break;
            case JUMP:
//                System.out.println("Действие - прыжок");
                act = maxJump;
                break;
        }
        return act;
    }



}
