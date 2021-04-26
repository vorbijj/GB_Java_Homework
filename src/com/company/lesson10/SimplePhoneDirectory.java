package com.company.lesson10;

import java.util.HashMap;
import java.util.Map;

public class SimplePhoneDirectory {
    public static void main(String[] args) {

        PhoneDirectory[] phoneDirectory = new PhoneDirectory[] {
                new PhoneDirectory("8(845)835-35-41", "Ivanov"),
                new PhoneDirectory("8(845)835-35-42", "Vasilyev"),
                new PhoneDirectory("8(845)835-35-43", "Petrov"),
                new PhoneDirectory("8(845)835-36-67", "Petrov"),
                new PhoneDirectory("8(845)835-37-56", "Ivanov"),
                new PhoneDirectory("8(845)835-35-87", "Petrov"),
                new PhoneDirectory("8(845)839-35-67", "Harlamov"),
                new PhoneDirectory("8(845)839-41-98", "Isaev"),
                new PhoneDirectory("8(845)839-04-31", "Nikitin"),
                new PhoneDirectory("8(845)833-00-21", "Isaev"),
                new PhoneDirectory("8(845)821-22-22", "Maneev")

        };

        String someSearchValue = "Ivanov";

        Map<String, String> mapPhoneDirectory = new HashMap<>();

        add(phoneDirectory, mapPhoneDirectory);

        get(someSearchValue, mapPhoneDirectory);
    }

    private static Map<String, String> add(PhoneDirectory[] pd, Map<String, String> mpd) {
        for (PhoneDirectory iter : pd) {
            mpd.put(iter.getNumberPhone(), iter.getName());
        }
        System.out.println("Список номеров: " + mpd);
        System.out.println();
        return mpd;
    }

    private static void get(String someSearchValue, Map<String, String> mpd) {
        boolean checkSearch = true;
        System.out.println("Поиск по фамилии " + someSearchValue + ":");
        for (Map.Entry<String, String> iter : mpd.entrySet()) {
            if (iter.getValue().equals(someSearchValue)) {
                System.out.println(iter.getValue() + " - " + iter.getKey());
                checkSearch = false;
            }
        }
        if (checkSearch) {
            System.out.println("Совпадений не найдено, попробуйте указать другую фамилию");
        }
    }

}

class PhoneDirectory {
    private String numberPhone;
    private String name;

    public PhoneDirectory(String numberPhone, String name) {
        this.numberPhone = numberPhone;
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }

    public void printDataNumberPhone() {
        System.out.println("Номер: " + numberPhone + " - " + name);
    }
}
