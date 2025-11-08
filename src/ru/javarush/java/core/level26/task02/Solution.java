package ru.javarush.java.core.level26.task02;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Создаем "картотеку" студентов: ключ — имя (String), значение — возраст (Integer)
        Map<String, Integer> students = new HashMap<>();

        // Добавляем три записи о студентах
        students.put("Иван", 20);
        students.put("Мария", 21);
        students.put("Алексей", 19);

        // Выводим полный список всех студентов и их возрастов
        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student);
        }
    }
}