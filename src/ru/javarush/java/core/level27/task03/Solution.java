package ru.javarush.java.core.level27.task03;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаём словарь переводов: английское слово -> русский перевод
        Map<String, String> words = new HashMap<>();

        // Заполняем словарь тремя парами
        words.put("dog", "собака");
        words.put("cat", "кошка");
        words.put("bird", "птица");

        // Перебираем пары через for-each по entrySet()
        // (под капотом используется Iterator, что и требуется по условию)
        for (Map.Entry<String, String> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " " + "=" + " " + entry.getValue());
        }
    }
}