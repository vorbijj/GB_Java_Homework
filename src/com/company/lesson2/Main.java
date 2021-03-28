package com.company.lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr01 = {1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0};
        printArrayConvertNullAndOne(arr01);

        int [] arrNull = new int [8];
        printArrayArithmeticSequence(arrNull);

        int [] arrMinSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArrayMinSix(arrMinSix);

        int [][] arrDiagonal = new int[5][5];
        printArrayDiagonal(arrDiagonal);

        int [] arrMaxMin = {6, -9, 0, 4, 56, -78, 1};
        printNumberMaxMin(arrMaxMin);

        int [] arrIsEqually = {2, 2, 2, 1, 2, 2, 10, 1};
        printArrayBalance(arrIsEqually);

        int [] arrShift = {1, 2, 3, 4, 5, 6, 7};
        int n = 3;
        printArrayShift(arrShift, n);

    }

    public static void printArrayShift(int[] arrShift, int n) {
        System.out.println("Задан массив: \n" + Arrays.toString(arrShift));
        if (n == 0) {
            System.out.println("Введите на сколько позиций смещать массив, n = " + n);
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                int buffer1 = arrShift[0];
                arrShift[0] = arrShift[arrShift.length - 1];
                for (int j = 1; j < arrShift.length; j++) {
                    int buffer2 = arrShift[j];
                    arrShift[j] = buffer1;
                    buffer1 = buffer2;
                }
            }
            System.out.println("Массив после смещения на " + n + " позиции вправо равен: \n" + Arrays.toString(arrShift));
        } else {
            for (int i = 1; i <= Math.abs(n); i++) {
                int buffer1 = arrShift[arrShift.length - 1];
                arrShift[arrShift.length - 1] = arrShift[0];
                for (int j = arrShift.length - 2; j >= 0; j--) {
                    int buffer2 = arrShift[j];
                    arrShift[j] = buffer1;
                    buffer1 = buffer2;
                }
            }
            System.out.println("Массив после смещения на " + n + " позиции влево равен: \n" + Arrays.toString(arrShift));
        }
    }

    public static void printArrayBalance(int[] arrIsEqually) {
        System.out.println("Задан массив: \n" + Arrays.toString(arrIsEqually));
        int sumL = 0;
        boolean isCheckEqually = false;
        for (int i = 0; i < arrIsEqually.length - 1; i++) {
            sumL += arrIsEqually[i];
            int sumR = 0;
            for (int j = i + 1; j < arrIsEqually.length ; j++) {
                sumR += arrIsEqually[j];
            }
            if (sumL == sumR) {
                isCheckEqually = true;
                System.out.println("Равенство левой и правой части элементов массива: " + isCheckEqually);
                int numberPosition = i;
                for (i = 0; i <= numberPosition; i++) {
                    System.out.print(arrIsEqually[i] + " ");
                }
                System.out.print(" || ");
                for (int j = numberPosition + 1; j < arrIsEqually.length; j++) {
                    System.out.print(arrIsEqually[j] + " ");
                }
            }
        }
        if (!isCheckEqually) {
            System.out.println("Равенство левой и правой части элементов массива: " + isCheckEqually);
        }
        System.out.println();
        System.out.println();
    }

    public static void printNumberMaxMin(int[] arrMaxMin) {

        if (arrMaxMin.length == 0) {
            System.out.println("\nВведен нулевой массив, введите корректный массив");
        } else {
            int maxA = arrMaxMin[0];
            int minA = arrMaxMin[0];
            System.out.println("\nЗадан массив: \n" + Arrays.toString(arrMaxMin));

            for (int i = 0; i < arrMaxMin.length; i++) {
                if (arrMaxMin[i] > maxA) {
                    maxA = arrMaxMin[i];
                }
            }

            for (int i = 0; i < arrMaxMin.length; i++) {
                if (arrMaxMin[i] < minA) {
                    minA = arrMaxMin[i];
                }
            }
            System.out.println("Максимальное число массива: " + maxA);
            System.out.println("Минимальное число массива: " + minA + "\n");
        }
    }

    public static void printArrayDiagonal(int[][] arrDiagonal) {
        for (int i = 0, j = 0; i < arrDiagonal.length; i++, j++) {
            arrDiagonal[i][j] = 1;
        }
        for (int i = 0, j = arrDiagonal.length-1; i < arrDiagonal.length; i++, j--) {
            arrDiagonal[i][j] = 1;
        }

        System.out.println("Массив, заполненый по диагонали 1 равен:");
        printArrayTwoDimensional(arrDiagonal);
    }

    public static void printArrayTwoDimensional(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printArrayMinSix(int[] arrMinSix) {
        System.out.println("Задан массив: \n" + Arrays.toString(arrMinSix));
        for (int i = 0; i < arrMinSix.length; i++) {
            if (arrMinSix[i] < 6) {
                arrMinSix[i] *= 2;
            }
        }
        System.out.println("Массив после проверки чисел меньше шести: \n" + Arrays.toString(arrMinSix) + "\n");
    }

    public static void printArrayArithmeticSequence(int[] arrNull) {
        System.out.println("Задан массив: \n" + Arrays.toString(arrNull));
        for (int i = 1; i < arrNull.length; i++) {
            arrNull[i] = arrNull[i-1] + 3;
        }
        System.out.println("Массив после заполнения последовательности: \n" + Arrays.toString(arrNull) + "\n");
    }

    public static void printArrayConvertNullAndOne(int[] arr01) {
        boolean isCheck = false;
        System.out.println("Задан массив: \n" + Arrays.toString(arr01));

        for (int i = 0; i < arr01.length; i++ ){
            if ( arr01[i] == 0 ) {
                arr01[i] = 1;
                isCheck = true;
            } else if (arr01[i] == 1) {
                arr01[i] = 0;
                isCheck = true;
            } else {
                System.out.println("В мыссиве указано некорректное число " + arr01[i] + ".\n"
                        + "Пожалуйста укажите в массиве число 0 или 1.");
                isCheck = false;
                break;
            }
        }

        if (isCheck) {
            System.out.println("Массив после конвертации 0 на 1, 1 на 0: \n" + Arrays.toString(arr01) + "\n");
        }
    }

}
