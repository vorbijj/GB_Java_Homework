package com.company.lesson11;

import java.util.List;

public class MainClass {
    public static void main (String[] args) {

        ArrBox<Integer> arr1 = new ArrBox<> (1, 2, 3, 4);
        ArrBox<String> arr2 = new ArrBox<> ("1", "2", "3", "тест", "предпоследний", "будет первым");

        Integer[] arr3 = {1, 3, 45, 56, 34, 0};
        String[] arr4 = {"первый", "второй", "третий", "четвертый", "пятый", "шестой"};

        arr1.printArr();
        arr1.changeTwoElements();
        arr1.printArrAfterChange();

        arr2.printArr();
        arr2.changeTwoElements();
        arr2.printArrAfterChange();

        List<?> arrList = ArrBox.transformationArrToArrayList(arr3);
        System.out.println("Список arrList: " + arrList);

        List<?> arrList2 = ArrBox.transformationArrToArrayList(arr4);
        System.out.println("Список ArrList2: " + arrList2);


    }

}
