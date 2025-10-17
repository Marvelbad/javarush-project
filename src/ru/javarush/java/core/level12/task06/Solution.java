package ru.javarush.java.core.level12.task06;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем ассоциативный массив: ключ — имя студента, значение — его оценка
        HashMap<String, Integer> studentGrades = new HashMap<>();

        // Добавляем запись: "Анна" -> 5
        studentGrades.put("Анна", 5);

        // Проверяем, есть ли в словаре оценка для "Анны"
        if (studentGrades.containsKey("Анна")) {
            // Получаем оценку и выводим сообщение
            System.out.println("Оценка Анны: " + studentGrades.get("Анна"));
        }
    }
}