package com.company.lesson12;


public class MainClass {
    public static void main(String[] args) {
        printTimeWorkOne();
        printTimeWorkTwo();
    }



    private static void printTimeWorkOne() {
        final int SIZE1 = 10_000_000;
        float[] arrOne = new float[SIZE1];
        long  timeStartMeasureOne;
        long  timeEndMeasureOne;

        for (int i = 0; i < arrOne.length; i++) {
            arrOne[i] = 1;
        }

        timeStartMeasureOne = System.currentTimeMillis();

        doCalc(arrOne);

        timeEndMeasureOne = System.currentTimeMillis();

        System.out.println("Метод printTimeWorkOne, время работы, мс: " + (timeEndMeasureOne - timeStartMeasureOne));
    }



    private static void printTimeWorkTwo() {
        final int SIZE2 = 10_000_000;
        float[] arrTwo = new float[SIZE2];
        long  timeStartMeasureTwo;
        long  timeEndMeasureTwo;

        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = 1;
        }

        timeStartMeasureTwo = System.currentTimeMillis();

        float[] arrOneOfTwo = new float[SIZE2/2];
        float[] arrTwoOfTwo = new float[SIZE2/2];

        System.arraycopy(arrTwo, 0, arrOneOfTwo, 0 , SIZE2/2);
        System.arraycopy(arrTwo, SIZE2/2, arrTwoOfTwo, 0 , SIZE2/2);

        Thread flowOneOfTwo = new Thread(() -> {
            doCalc(arrOneOfTwo);
        });

        Thread flowTwoOfTwo = new Thread(() -> {
            doCalc(arrTwoOfTwo);
        });

        flowOneOfTwo.start();
        flowTwoOfTwo.start();

        try {
            flowOneOfTwo.join();
            flowTwoOfTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arrOneOfTwo, 0, arrTwo, 0 , SIZE2/2);
        System.arraycopy(arrTwoOfTwo, 0, arrTwo, SIZE2/2 , SIZE2/2);

        timeEndMeasureTwo = System.currentTimeMillis();

        System.out.println("Метод printTimeWorkTwo, время работы, мс: " + (timeEndMeasureTwo - timeStartMeasureTwo));
    }




    private static float[] doCalc (float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }
}


