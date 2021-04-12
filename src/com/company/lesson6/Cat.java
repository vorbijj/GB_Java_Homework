package com.company.lesson6;

public class Cat extends Animal {

    static int countCats = 0;

    public Cat(String name, int distanceRun, int distanceSwim) {
        super(name, distanceRun, distanceSwim);
        ++countCats;
    }

    @Override
    public void run() {
        if (getDistanceRun() > 200) {
            System.out.println("Кот " + getName() + " пробежал 200м из " + getDistanceRun() + "м");
        } else {
            System.out.println("Кот " + getName() + " пробежал " + getDistanceRun() + "м из "  + getDistanceRun() + "м");
        }
    }

    @Override
    public void swim() {
        System.out.println("Кот " + getName() + " проплыл 0м из " + getDistanceSwim() + "м, он не умеет плавать");
    }

    public static void displayQuantityCats() {
        System.out.println("Количество котов равно: " + countCats);
    }
}
