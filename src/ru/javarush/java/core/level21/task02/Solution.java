package ru.javarush.java.core.level21.task02;

import java.util.function.Consumer;

public class Solution {
    public static void main(String[] args) {
        // Обработчик текста: принимает строку и печатает её в верхнем регистре.
        // Используем стандартный функциональный интерфейс Consumer<String>.
        Consumer<String> consumer = (text) -> System.out.println(text.toUpperCase());

        // Проверка работы обработчика на примере:
        consumer.accept("java");
    }
}