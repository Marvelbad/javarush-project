package ru.javarush.java.core.level12.task02;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список строк (названия фруктов)
        List<String> fruits = new ArrayList<>();

        // Добавляем исходные фрукты в заданном порядке
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        // Заменяем второй элемент ("Банан") на "Груша"
        fruits.set(1, "Груша");

        // Удаляем первый элемент ("Яблоко")
        fruits.remove(0);

        // Выводим оставшиеся фрукты, каждый на новой строке
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}