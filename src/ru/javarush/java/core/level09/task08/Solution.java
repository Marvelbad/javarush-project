package ru.javarush.java.core.level09.task08;

import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные
        String studentName = "Анна"; // Имя студента
        int correctAnswers = 45; // Количество правильных ответов
        int totalQuestions = 50; // Общее количество вопросов

        // Вычисляем процент правильных ответов
        double persent = (double) correctAnswers / totalQuestions * 100;

        // Форматируем строку с использованием Locale.GERMANY
        String formatted = String.format(Locale.GERMANY, "%s: %.1f%% правильных ответов", studentName, persent);

        // Выводим результат на экран
        System.out.println(formatted);
    }
}