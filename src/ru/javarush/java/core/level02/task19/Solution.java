package ru.javarush.java.core.level02.task19;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем цены двух товаров как целые числа
        int itemOne = scanner.nextInt();
        int itemTwo = scanner.nextInt();

        // Складываем и выводим сумму
        System.out.println(itemOne + itemTwo);
    }
}