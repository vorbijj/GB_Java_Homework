package com.company.lesson7;

public class MainClass {
    public static void main(String[] args) {

        int addition = 20;

        Cat[] cats = {
                new Cat("Barsik", 35),
                new Cat("Vas'ka", 25),
                new Cat("Shkoda", 15),
                new Cat("Boris", 30),
                new Cat("Lucky", 12)
        };

        Plate plate = new Plate(100);

        for (Cat cat: cats) {
            plate.info();
            cat.eat(plate);
            plate.info();
            System.out.println();
        }

        for (Cat cat: cats) {
            if (!cat.isSatiety()) {
                System.out.println("!!!Добавка порции еды!!!");

                plate.setFood(addition);
                plate.info();
                cat.eat(plate);
                plate.info();

                System.out.println();
            }
        }

    }
}
