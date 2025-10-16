package ru.javarush.java.core.level12.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения имен гостей
        List<String> names = new ArrayList<>();

        // Добавляем имена в список
        names.add("Анна");
        names.add("Иван");
        names.add("Петр");
        names.add("Мария");

        // Проверяем, содержится ли имя "Петр" в списке
        System.out.println(names.contains("Петр"));
        // Проверяем, содержится ли имя "Сергей" в списке
        System.out.println(names.contains("Сергей"));
    }
}