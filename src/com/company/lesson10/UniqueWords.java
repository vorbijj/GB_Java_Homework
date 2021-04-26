package com.company.lesson10;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {

        List<String> gameTitles = new ArrayList<>();
        gameTitles.add("Хоккей");
        gameTitles.add("Хоккей");
        gameTitles.add("Футбол");
        gameTitles.add("Баскетбол");
        gameTitles.add("Хоккей");
        gameTitles.add("Волейбол");
        gameTitles.add("Футбол");
        gameTitles.add("Тенис");
        gameTitles.add("Регби");
        gameTitles.add("Баскетбол");
        gameTitles.add("Футбол");
        gameTitles.add("Хоккей");

        System.out.println("Список слов:" + gameTitles);

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> mapUniqueWords = new HashMap<>();


        for (int i = 0; i < gameTitles.size(); i++) {
            uniqueWords.add(gameTitles.get(i));
        }
        System.out.println();
        System.out.println("Список уникальных слов: " + uniqueWords);


        for (int i = 0; i < gameTitles.size(); i++) {
            Integer counter = mapUniqueWords.get(gameTitles.get(i));
            mapUniqueWords.put(gameTitles.get(i), counter == null ? 1 : counter + 1);
        }

        System.out.println();
        System.out.println("Список уникальных слов и сколько раз они встречаются: " + mapUniqueWords);


    }
}
