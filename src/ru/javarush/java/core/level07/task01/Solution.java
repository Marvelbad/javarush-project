package ru.javarush.java.core.level07.task01;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        // Объявляем массив на 5 целых чисел — это наш "рюкзак"
        int[] inventorySlots = new int[5];

        // Кладем артефакт (число 7) в первую ячейку массива (индекс 0)
        inventorySlots[0] = 7;

        // Выводим значение из первой ячейки, чтобы убедиться, что артефакт на месте
        System.out.println(inventorySlots[0]);
    }
}