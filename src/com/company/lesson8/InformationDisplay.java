package com.company.lesson8;

public class InformationDisplay {

    public static void printInfoTrack (boolean isWent, DoIt obs, String type, String name, int limit) {
        if (isWent) {
            System.out.println("Участник " + type + " " + name + " успешно прошел препятствие: " + obs.definingObstacle().getNameAction() + " " + limit + " из " + obs.distance());
        } else {
            System.out.println("Участник " + type + " " + name + " не смог пройти препятствие: " + obs.definingObstacle().getNameAction() + " " + limit + " из " + obs.distance());
            System.out.println(name + " сошел с полосы препятствий: ");
        }
    }

}
