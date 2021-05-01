package com.company.lesson11;

public class Fruit {

    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}

class Apple extends Fruit implements SpecificFruit {

    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit implements SpecificFruit {
    public Orange() {
        super (1.5f);
    }
}

