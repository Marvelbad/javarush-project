package ru.javarush.java.core.level05.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя ввод числа N (magicLimit)
        System.out.println("Enter digit:");
        int magicLimit = console.nextInt();
        // Вычисляем и выводим квадрат каждого числа от 1 до N
        for (int i = 1; i <= magicLimit; i++) {
            // Вывод квадрата числа
            System.out.println(i * i);
        }
    }
}