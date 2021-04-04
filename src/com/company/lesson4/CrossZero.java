package com.company.lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossZero {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner scr = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while(true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил искуственный интелект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {
        if (checkLineHorisont(symb)) return true;

        if (checkLineVertical(symb)) return true;

        if (checkDiagonalDown(symb)) return true;

        if (checkDiagonalUp(symb)) return true;

        return false;
    }

    public static boolean checkDiagonalUp(char symb) {
        int countDiagonalUp = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE; i++, j--) {
            if (map[i][j] == symb) {
                countDiagonalUp++;
            }
            if (countDiagonalUp == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDiagonalDown(char symb) {
        int countDiagonalDown = 0;
        for (int i = 0, j = 0; i < SIZE; i++, j++) {
            if (map[i][j] == symb) {
                countDiagonalDown++;
            }
            if (countDiagonalDown == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLineVertical(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int countVertical = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == symb) {
                    countVertical++;
                }
            }
            if (countVertical == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkLineHorisont(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int countHorisont = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    countHorisont++;
                }
            }
            if (countHorisont == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(SIZE);
            y = rnd.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.println("Компьютер сходил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scr.nextInt() - 1;
            y = scr.nextInt() - 1;
        } while (!isCellValid(x,y)); // while (isCellValid(x,y) == false)
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid (int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
