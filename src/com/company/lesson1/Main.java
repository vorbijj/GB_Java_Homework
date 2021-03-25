package com.company.lesson1;

public class Main {

    public static void main(String[] args) {

        byte numb1 = 7;
        byte numb2 = -13;

        short numb3 = 120;
        short numb4 = -138;

        int numb5 = 1201;
        int numb6 = 907;

        long numb7 = 18456L;
        long numb8 = - 98457L;

        float ft1 = 12.98f;
        float ft2 = 56.73f;
        float ft3 = 45.32f;
        float ft4 = 23.31f;

        double db1 = 123.76;
        double db2 = -671.01;

        char ch1 = 'A';
        char ch2 = '\u0061';

        boolean isActive = true;
        boolean bool = false;


        int x = 12;
        int y = 8;
        int number = 56;

        System.out.println("Метод возвращает результат выражения a * (b + (c / d)) = " + calcNumbers(ft1, ft2, ft3, ft4) + "\n");
        System.out.println("Сумма двух чисел " + x + " и " + y + " лежит в диапазоне от 10 до 20 включительно: " +
                isSumTwoNumbersRange10To20(x, y) + "\n");

        printNumberPositiveOrNegative(-17);

        System.out.println("Передаем в метод число " + number + ": " + isNumberPositiveOrNegative(number) + "\n");

        printHelloName("Андрей");

        printYearLeap(1994);
        printYearLeap(1996);
        printYearLeap(2000);
        printYearLeap(1998);
        printYearLeap(1943);
        printYearLeap(842);
        printYearLeap(560);
    }

    public static float calcNumbers(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean isSumTwoNumbersRange10To20(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

    public static void printNumberPositiveOrNegative (int number) {
        if (number >= 0) {
            System.out.println("Число " + number + ": положительное\n");
        } else {
            System.out.println("Число " + number + ": отрицательное\n");
        }
    }

    public static boolean isNumberPositiveOrNegative (int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void printHelloName (String str) {
        System.out.println("Привет, " + str + "!\n");
    }

    public static void printYearLeap (int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
    }
}
