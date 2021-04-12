package com.company.lesson6;

public class Dog extends Animal {

    static int countDogs = 0;

    public Dog(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
        ++countDogs;
    }

    @Override
    public void run() {
        if (getDistanceRun() > 500) {
            System.out.println("Собака " + getName() + " пробежала 500м из " + getDistanceRun() + "м");
        } else {
            System.out.println("Собака " + getName() + " пробежала " + getDistanceRun() + "м из " + getDistanceRun() + "м");
        }
    }

    @Override
    public void swim() {
        if (getDistanceSwim() > 10) {
            System.out.println("Собака " + getName() + " проплыла 10м из " + getDistanceSwim() + "м");
        } else {
            System.out.println("Собака " + getName() + " проплыла " + getDistanceSwim() + "м из " + getDistanceSwim() + "м");
        }
    }

    public static void displayQuantityDogs() {
        System.out.println("Количество собак равно: " + countDogs);
    }
}
