package ru.javarush.java.core.level21.task05;

import java.util.function.IntFunction;

public class Solution {
    public static void main(String[] args) {
        // Создаем "конвертер" через ссылку на статический метод Integer.toHexString(int)
        IntFunction<String> toHexConverter = Integer::toHexString;

        // Применяем конвертер к числу 255
        String apply = toHexConverter.apply(255);

        // Выводим шестнадцатеричное представление на экран
        System.out.println(apply);
    }
}