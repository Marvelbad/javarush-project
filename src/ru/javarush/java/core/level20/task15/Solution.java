package ru.javarush.java.core.level20.task15;

import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        // Предикат проверяет, что длина строки больше 5 символов
        Predicate<String> lengthChecker = s-> s.length() > 5;

        // Демонстрация работы на двух примерах
        System.out.println(lengthChecker.test("Java"));
        System.out.println(lengthChecker.test("FunctionalInterface"));
    }
}