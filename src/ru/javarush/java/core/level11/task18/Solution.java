package ru.javarush.java.core.level11.task18;

public class Solution {
    public static void main(String[] args) {
        // Объявляем массив playerInventory размером 3 элемента
        int[] playerInventory = {5, 6, 3};

        // Пытаемся вывести элемент массива с индексом 5
        // Это вызовет исключение ArrayIndexOutOfBoundsException
        System.out.println(playerInventory[5]);
    }
}