package com.company.lesson8;

public class MainClass {
    public static void main(String[] args) {

        boolean superCheck;
        int lenghtRun1 = 10;
        int heightJump1 = 2;
        int lenghtRun2 = 12;
        int heightJump2 = 3;

        Activity[] participants = new Activity[] {
                new Cat("Boris", 10, 3),
                new Human("Harry", 15, 2),
                new Robot("T-800", 25, 12)
        };

        DoIt[] obstacles = new DoIt[] {
                new RunningTrack(lenghtRun1),
                new Wall(heightJump1),
                new RunningTrack(lenghtRun2),
                new Wall(heightJump2)
        };

        for (Activity participant: participants) {
            participant.run();
            participant.jump();
            System.out.println();
        }

        System.out.println("Прохождение полосы препятствий:");

        for (Activity participant: participants) {
            superCheck = true;
            for (DoIt obstacle: obstacles){
                if (superCheck){
                   superCheck = participant.isGoTrack(obstacle);
                } else {
                    continue;
                }
            }
            System.out.println();
        }

    }
}