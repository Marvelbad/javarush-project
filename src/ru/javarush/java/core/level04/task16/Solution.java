package ru.javarush.java.core.level04.task16;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры
        Scanner console = new Scanner(System.in);

        // Переменная для хранения суммы всех продаж
        int sumOfSell = 0;

        // Бесконечный цикл для ввода данных
        while (true) {
            // Запрашиваем сумму продажи
            System.out.println("Введите сумму продажи:");
            // Считываем введенное число
            int cash = console.nextInt();

            // Если введено отрицательное число, выходим из цикла
            if (cash < 0) {
                break;
            }
            // Добавляем положительное число к общей сумме
            sumOfSell += cash;
        }

        // Выводим итоговую сумму всех продаж
        System.out.println(sumOfSell);
    }
}