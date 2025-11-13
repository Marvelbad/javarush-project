package ru.javarush.java.core.level28.task09;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем LinkedHashMap с "порядком по обращению" (accessOrder = true).
        LinkedHashMap<String, Integer> recentlyViewed = new LinkedHashMap<>(16, 0.75f, true);

        // Добавляем товары: ключ — код товара, значение — его id
        recentlyViewed.put("a", 1);
        recentlyViewed.put("b", 2);
        recentlyViewed.put("c", 3);

        // Имитация просмотра товара "b": доступ через get переносит "b" в конец
        recentlyViewed.get("b");

        // Выводим ключи в текущем порядке обхода: ожидается a, c, b
        for (String key : recentlyViewed.keySet()) {
            System.out.println(key);
        }
    }
}