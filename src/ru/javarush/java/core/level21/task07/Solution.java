package ru.javarush.java.core.level21.task07;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем список строк с фруктами
        List<String> fruits = Arrays.asList("яблоко", "банан", "груша");

        // Сортируем список по алфавиту, используя ссылку на метод сравнения строк
        fruits.sort(String::compareTo);

        // Выводим каждый фрукт на новой строке
        fruits.forEach(System.out::println);
    }
}