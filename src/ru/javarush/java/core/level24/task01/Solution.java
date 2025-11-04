package ru.javarush.java.core.level24.task01;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        // Создаем две "проблемы": сетевую (IOException) и пропажу данных (NullPointerException)
        IOException networkProblem = new IOException();
        NullPointerException missingDataError = new NullPointerException();

        // Для каждого исключения получаем непосредственный класс-родитель через рефлексию
        String network = networkProblem.getClass().getSuperclass().getSimpleName();
        String missing = missingDataError.getClass().getSuperclass().getSimpleName();

        // Выводим имена родительских классов
        System.out.println(network);
        System.out.println(missing);
    }
}