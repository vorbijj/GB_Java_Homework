package com.company.lesson6;

public abstract class Animal {
    static int countAnimals = 0;
    private String name;
    private int distanceRun;
    private int distanceSwim;

    public Animal(String name, int distanceRun, int distanceSwim) {
        this.name = name;
        this.distanceRun = distanceRun;
        this.distanceSwim = distanceSwim;
        ++countAnimals;
    }

    public String getName() {
        return name;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public boolean isCheckDistaceRun() {
        if (getDistanceRun() < 0) {
            System.out.println("Введена некорректная длина дистанции");
            return true;
        }
        return false;
    }

    public boolean isCheckDistaceSwim() {
        if (getDistanceSwim() < 0) {
            System.out.println("Введена некорректная длина дистанции");
            return true;
        }
        return false;
    }

    public abstract void run();
    public abstract void swim();

    public static void displayQuantityAnimals() {
        System.out.println("Количество животных равно: " + countAnimals);
    }

}
