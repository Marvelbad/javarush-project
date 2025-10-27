package ru.javarush.java.core.level21.task04;

import java.util.function.Consumer;
import java.util.function.IntFunction;

public class Solution {
    public static void main(String[] args) {
        // Фиксированный префикс для всех отчётных строк
        String prefix = "Результат: ";


        // Лямбда-выражение — "функция форматирования":
        IntFunction<String> function = (value) -> prefix + (value * 2);

        // Вызов функции с аргументом 7 и вывод результата
        System.out.println(function.apply(7));
    }
}