package com.company.lesson14;

import java.util.Arrays;

public class ArrayHandler {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println(Arrays.toString(getArrayAfterFour(arr)));

        int[] arr14 = {1, 1, 4, 1, 1, 4, 1};
        System.out.println(isArrayWithOneAndFour(arr14));
    }

    static int[] getArrayAfterFour(int[] arr) {
        int quantityNumAfterFour = 0;
        boolean checkFail = true;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] ==  4) {
                quantityNumAfterFour = arr.length - (i+1);
                checkFail = false;
                break;
            }
        }

        if (checkFail) {
            throw new RuntimeException();
        }

        int[] arrAfterFour = new int [quantityNumAfterFour];
        System.arraycopy(arr, arr.length - arrAfterFour.length, arrAfterFour, 0, arrAfterFour.length);

        return arrAfterFour;
    }

    static boolean isArrayWithOneAndFour(int[] arr) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int i = 0; i < arr.length; i++) {
           switch (arr[i]) {
               case 1:
                   hasOne = true;
                   break;
               case 4:
                   hasFour = true;
                   break;
               default:
                   return false;
           }
        }
        return hasOne && hasFour;
    }

}
