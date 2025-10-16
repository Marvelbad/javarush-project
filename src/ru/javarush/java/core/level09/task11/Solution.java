package ru.javarush.java.core.level09.task11;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка
        String word = "programming";

        // Извлечение подстроки "gram" с помощью метода substring()
        String substring = word.substring(3, 7);

        // Вывод подстроки на экран
        System.out.println(substring);
    }
}