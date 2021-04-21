package com.company.lesson7;

public class Plate {
    private int food;
    private boolean decreased;

    public Plate(int food) {
        this.food = food;
        decreased = false;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public boolean isDecreased() {
        return decreased;
    }

    public void decreaseFood(int n) {
        if ((food - n) >= 0) {
            food -= n;
            decreased = true;
        } else {
            System.out.println("Недостаточно еды в миске");
            decreased = false;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
