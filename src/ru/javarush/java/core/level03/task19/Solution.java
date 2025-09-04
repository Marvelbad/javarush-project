package ru.javarush.java.core.level03.task19;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную currentHour, которая хранит текущий час (от 0 до 23)
        int currentHour = 18;

        // Используем тернарный оператор для выбора приветствия
        String greetingMessage = currentHour < 12 ? "Доброе утро" : "Добрый день";

        // Выводим приветственное сообщение на экран
        System.out.println(greetingMessage);
    }
}