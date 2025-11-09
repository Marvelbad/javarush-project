package ru.javarush.java.core.level26.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // Создаём Map: ключ — название дня недели (String), значение — его номер (Integer)
        Map<String, Integer> daysOfWeek = new HashMap<>();

        // Добавляем элементы согласно условию задачи
        daysOfWeek.put("Monday", 1);
        daysOfWeek.put("Tuesday", 2);
        daysOfWeek.put("Wednesday", 3);

        // Проходим по всем парам ключ-значение и выводим в требуемом формате
        for (Map.Entry<String, Integer> day : daysOfWeek.entrySet()) {
            String key = day.getKey();
            Integer value = day.getValue();
            String formatted = String.format("День: %s, Номер: %d", key, value);
            System.out.println(formatted);
        }
    }
}