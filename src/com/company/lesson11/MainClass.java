package com.company.lesson11;

public class MainClass {
    public static void main(String[] args) {

        ArrBox<Integer> arr1 = new ArrBox<> (1, 2, 3, 4);
        ArrBox<String> arr2 = new ArrBox<> ("1", "2", "3", "тест", "предпоследний", "будет первым");

        arr1.printArr();
        arr1.changeTwoElements();
        arr1.printArrAfterChange();

        arr2.printArr();
        arr2.changeTwoElements();
        arr2.printArrAfterChange();

    }
}
