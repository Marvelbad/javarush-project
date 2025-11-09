package ru.javarush.java.core.level26.task08;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Исходный список с повторами
        List<String> products = Arrays.asList("яблоко", "груша", "яблоко", "слива", "груша");

        // Используем Set для удаления дубликатов.
        Set<String> filteredList = new TreeSet<>(products);

        // Выводим итоговый набор уникальных товаров
        System.out.println(filteredList);
    }
}