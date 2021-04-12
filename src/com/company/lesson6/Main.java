package com.company.lesson6;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Barsik", 120, 7),
                new Cat("Murzik", 168, 9),
                new Dog("Bobik", 340, 8),
                new Cat("Vas'ka", 250, 1),
                new Dog("Strelka", 530, 12),
                new Dog("Belka", 230, 9)
        };

        for (Animal anim: animals) {
            anim.run();
            if (anim.isCheckDistaceRun()){
                break;
            }
            anim.swim();
            if (anim.isCheckDistaceSwim()){
                break;
            }
        }

        System.out.println();
        Animal.displayQuantityAnimals();
        Cat.displayQuantityCats();
        Dog.displayQuantityDogs();

    }
}
