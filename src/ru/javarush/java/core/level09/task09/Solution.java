package ru.javarush.java.core.level09.task09;

public class Solution {
    public static void main(String[] args) {
        // Объявляем строку с секретным словом
        String secret = "Java";

        // Извлекаем символ с индексом 1 (второй символ, т.к. индексация с нуля) методом charAt()
        char c = secret.charAt(1);

        // Выводим извлеченный символ на экран
        System.out.println(c);
    }
}