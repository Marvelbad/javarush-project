package ru.javarush.java.core.level26.task06;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // TreeMap автоматически поддерживает сортировку ключей по алфавиту (естественный порядок String)
        Map<String, Integer> fruitList = new TreeMap<>();

        // Добавляем данные о фруктах
        fruitList.put("pear", 6);
        fruitList.put("apple", 2);
        fruitList.put("banana", 4);

        // Проходим по записям: порядок уже алфавитный благодаря TreeMap
        for (Map.Entry<String, Integer> fruit : fruitList.entrySet()) {
            String key = fruit.getKey();
            int value = fruit.getValue();
            String formatted = String.format("Фрукт: %s, Количество: %d", key, value);
            System.out.println(formatted);
        }
    }
}