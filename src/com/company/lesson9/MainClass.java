package com.company.lesson9;

public class MainClass {
    public static void main(String[] args) {
        int sum;
        String[][] arrSrt = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };


        try {
            sum = sumArrayValues(arrSrt);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeExeption ex) {
            ex.printStackTrace();
            System.out.println("В метод передан массив не равный размерности 4х4, передайте массив нужной размерности");
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
            System.out.println("Укажите корректное значение для подсчета суммы элементов массива");
        }
        printArray(arrSrt);
    }

    private static int sumArrayValues(String[][] arr) throws MyArraySizeExeption, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) {
                throw new MyArraySizeExeption();
            }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeExeption();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("error, position in the array [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    private static void printArray(String[][] arr) {
        System.out.println("Заданный массив");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
