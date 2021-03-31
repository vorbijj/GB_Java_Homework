package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static final int MAX_NUMBER = 10;
    public static final int COUNT_ATTEMPTS = 3;

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String repeatGame;

        do {
            int hiddenNumber = random.nextInt(MAX_NUMBER);
            System.out.println("Загадано число от 0 до 9 включительно, отгадайте это число!");

            for (int i = 1; i <= COUNT_ATTEMPTS; i++) {
                System.out.print("Введите число:");
                int answer = scanner.nextInt();

                if (answer > hiddenNumber) {
                    System.out.println("Загаданное число меньше! Осталось попыток: " + (COUNT_ATTEMPTS - i));
                } else if (answer < hiddenNumber) {
                    System.out.println("Загаданное число больше! Осталось попыток: " + (COUNT_ATTEMPTS - i));
                } else {
                    System.out.println("Вы угадали!");
                    break;
                }
                if (i == COUNT_ATTEMPTS) {
                    System.out.println("Вы проиграли. Было загадано число: " + hiddenNumber);
                }
            }
            System.out.println("Повторить игру еще раз? Напишите \"да\"(1) или \"нет\"(0) ");
            System.out.print("-> ");
            repeatGame = scanner.next();
        } while (repeatGame.equalsIgnoreCase("да") || repeatGame.equals("1"));

        System.out.println("Игра окончена!");

        scanner.close();
    }
}
