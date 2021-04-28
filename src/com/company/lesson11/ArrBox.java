package com.company.lesson11;

import java.util.Arrays;

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




}
