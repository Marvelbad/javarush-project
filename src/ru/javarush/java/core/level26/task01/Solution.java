package ru.javarush.java.core.level26.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список (реализация ArrayList) для хранения названий фруктов
        List<String> fruits = new ArrayList<>();

        // Добавляем фрукты в заданном порядке
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Груша");

        // Выводим весь список: метод toString() у коллекции показывает все элементы
        for (String fruit : fruits) {
            System.out.println(fruit.toString());
        }
    }
}