package com.company.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrBox<T> {
    private T[] arr;


    public ArrBox(T... arr) {
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }

    public T[] changeTwoElements() {

        T temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        return arr;

    }

    public void printArr() {
        System.out.println("Массив до замены двух элементов: " + Arrays.toString(arr));
    }

    public void printArrAfterChange() {
        System.out.println("Массив после замены двух элементов: " + Arrays.toString(arr));
        System.out.println();
    }

    public static<T> List transformationArrToArrayList (T[] arr) {

        List<T> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        return arrList;
    }

}
