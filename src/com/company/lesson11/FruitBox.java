package com.company.lesson11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox <T extends Fruit & SpecificFruit> {
    private final List<T> container;
    private int capacity;
    private int initialCapacity;


    public FruitBox(int capacity, T... fruits) {

            if (capacity < fruits.length) {
                System.out.println("Укажите корректные входные данные вместимости коробки и количество фруктов.\n" +
                        "Вместимость (" + capacity + ") < количество фруктов (" + fruits.length + ")");
                throw new IllegalArgumentException ("Количество фруктов превышает вместимость коробки");
            }


        this.capacity = capacity - fruits.length;
        this.initialCapacity = capacity;
        this.container = new ArrayList<>(Arrays.asList(fruits));


    }

    public int getCapacity() {
        return capacity;
    }

    public int getInitialCapacity() {
        return initialCapacity;
    }

    public List<T> getContainer() {
        return container;
    }

    public float getWeight() {
        float commonWeight = 0.0f;

        for (T fruit : container) {
            commonWeight += fruit.getWeight();
        }
        return commonWeight;
    }

    boolean weightCompare(FruitBox<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) <0.001;
    }


    void transferFruitsToAnotherBox(FruitBox<T> anotherBox) {
        if (anotherBox == this) {
            return;
        }

        int countSize = Math.min(container.size(), anotherBox.capacity);

        List<T> fruits = container.subList(0, countSize);
        anotherBox.container.addAll(fruits);
        container.removeAll(fruits);

        anotherBox.capacity -= countSize;
        capacity += countSize;
    }

     public void addFruit(T fruit) {
        if (capacity > 0) {
            container.add(fruit);
            capacity--;
        } else {
            System.out.println("Добавить fruit нельзя, вместимость равна " + capacity);
        }
    }

    public String getInfoFruitBox(){
        return  getWeight()  + " вес коробки, " + getCapacity() + " из " + getInitialCapacity() + " ост.ед.вместимости";
    }

}
