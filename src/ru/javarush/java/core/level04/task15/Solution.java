package ru.javarush.java.core.level04.task15;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с клавиатуры
        Scanner console = new Scanner(System.in);

        // Просим пользователя ввести целое число больше 1
        System.out.println("Введите целое число:");
        int n = console.nextInt();
        // Проверяем, является ли число простым
        boolean isPrime = true;

        // Цикл для поиска первого делителя числа n
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // Если n делится на i без остатка
                // Выводим первый найденный делитель
                System.out.println(i);
                // Устанавливаем флаг, что число не простое
                isPrime = false;
                // Завершаем цикл, так как делитель найден
                break;
            }
        }

        // Если делитель не найден, выводим, что число простое
        if (isPrime) {
            System.out.println("Число простое");
        }
    }
}