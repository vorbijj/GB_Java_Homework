package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class GuessWordGame {

    public static final String[] WORDS = {
            "apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
            "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"
    };

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String repeatGame;

        do {

            boolean setRepeatGame = false;
            String hiddenWord = WORDS[random.nextInt(WORDS.length)];
            System.out.println("Загадано слово, отгадайте его!");

            while (setRepeatGame == false) {

                System.out.print("Введите слово:");
                String answer = scanner.next();
                String answerLowerCase = answer.toLowerCase();

                if (answerLowerCase.equals(hiddenWord)) {
                    System.out.println("Вы угадали!!! Загаданное слово: " + hiddenWord);
                    setRepeatGame = true;
                } else {
                    getPartOfAnswer(answerLowerCase, hiddenWord);
                }
            }

            System.out.println("Повторить игру еще раз? Напишите \"да\"(1) или \"нет\"(0) ");
            System.out.print("-> ");
            repeatGame = scanner.next();

        } while (repeatGame.equalsIgnoreCase("да") || repeatGame.equals("1"));

        System.out.println("Игра окончена!");

        scanner.close();
    }

    public static void getPartOfAnswer(String answerLowerCase, String hiddenWord) {
        StringBuilder strCheck = new StringBuilder();
        for (int i = 0; i < answerLowerCase.length(); i++) {
            if (i < hiddenWord.length()) {
                if (answerLowerCase.charAt(i) == hiddenWord.charAt(i)) {
                    strCheck.append(hiddenWord.charAt(i));
                } else {
                    strCheck.append("#");
                }
            }
        }
        strCheck.append("#########");
        System.out.println("Совпало часть слова: " + strCheck + ". Попробуйте еще раз.");
    }
}
