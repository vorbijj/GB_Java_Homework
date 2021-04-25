package com.company.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        satiety = plate.isDecreased();
        System.out.println("Кот " + name + " поел, он сытый: " + satiety);
    }

}
