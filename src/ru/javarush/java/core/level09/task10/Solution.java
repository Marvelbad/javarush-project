package ru.javarush.java.core.level09.task10;

public class Solution {
    public static void main(String[] args) {
        // Исходная строка
        String phrase = "I love programming in Java";

        // Используем метод indexOf() для поиска позиции слова "Java"
        int indexOf = phrase.indexOf("Java");

        // Выводим результат на экран
        System.out.println(indexOf);
    }
}