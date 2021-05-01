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

        List<?> arrList1 = ArrBox.transformationArrToArrayList(arr3);
        System.out.println("Список arrList1: " + arrList1);

        List<?> arrList2 = ArrBox.transformationArrToArrayList(arr4);
        System.out.println("Список arrList2: " + arrList2);

        System.out.println();



        FruitBox<Apple> appleFruitBox1 = new FruitBox<> (5, new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        System.out.println("appleFruitBox1: " + appleFruitBox1.getInfoFruitBox());

        FruitBox<Orange> orangeFruitBox1 = new FruitBox<> (6, new Orange(), new Orange(), new Orange(), new Orange());
        System.out.println("orangeFruitBox1: " + orangeFruitBox1.getInfoFruitBox());


        System.out.println("Сравнение двух ящиков по массе, appleFruitBox1 и orangeFruitBox1: "
                + orangeFruitBox1.weightCompare(appleFruitBox1));

        System.out.println();

        FruitBox<Orange> orangeFruitBox2 = new FruitBox<> (3);
        System.out.println("orangeFruitBox1: " + orangeFruitBox1.getInfoFruitBox());
        System.out.println("orangeFruitBox2: " + orangeFruitBox2.getInfoFruitBox());

        orangeFruitBox1.transferFruitsToAnotherBox(orangeFruitBox2);

        System.out.println("После перекладывания orangeFruitBox1: " + orangeFruitBox1.getInfoFruitBox());
        System.out.println("После перекладывания orangeFruitBox2: " + orangeFruitBox2.getInfoFruitBox());

        System.out.println();

        orangeFruitBox1.addFruit(new Orange());
        System.out.println("После добавления orangeFruitBox1: " + orangeFruitBox1.getInfoFruitBox());


        FruitBox<Apple> appleFruitBox2 = new FruitBox<> (1);

        appleFruitBox2.addFruit(new Apple());
        System.out.println("После добавления appleFruitBox2: " + appleFruitBox2.getInfoFruitBox());

        appleFruitBox2.addFruit(new Apple());
        System.out.println("После добавления appleFruitBox2: " + appleFruitBox2.getInfoFruitBox());

        System.out.println();

        FruitBox<Apple> appleFruitBox3 = new FruitBox<> (5, new Apple(), new Apple(), new Apple());
        FruitBox<Orange> orangeFruitBox5 = new FruitBox<> (3, new Orange(), new Orange());
        System.out.println("appleFruitBox3: " + appleFruitBox3.getInfoFruitBox());
        System.out.println("orangeFruitBox5: " + orangeFruitBox5.getInfoFruitBox());

        System.out.println("Сравнение двух ящиков по массе, appleFruitBox3 и orangeFruitBox5: "
                + orangeFruitBox5.weightCompare(appleFruitBox3));

    }

}
