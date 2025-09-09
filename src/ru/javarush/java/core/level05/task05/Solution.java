package ru.javarush.java.core.level05.task05;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем сканер для чтения числа с консоли
        Scanner console = new Scanner(System.in);
        System.out.println("Enter prime digit:");
        int pyramidHeight = console.nextInt();

        // Строим обелиск строка за строкой
        for (int row = 1; row <= pyramidHeight; row++) {
            // Количество пробелов слева: уменьшается от (N - 1) до 0
            int spaces = pyramidHeight - row;
            // Количество звездочек: растет по формуле (2 * row - 1)
            int stars = 2 * row - 1;

            // Печатаем пробелы для выравнивания
            for (int i = 0; i< spaces; i++) {
                System.out.print(" ");
            }
            // Печатаем звездочки
            for (int i = 0; i < stars; i++) {
                System.out.print("*");
            }
            // Переход на новую строку после каждой строки обелиска
            System.out.println();
        }
    }
}