package ru.javarush.java.core.level10.task11;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с консоли
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя номер месяца
        System.out.println("Введите номер месяца (от 1 до 12):");
        int month = console.nextInt();

        // Определяем время года с помощью оператора switch
        switch (month) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default: {
                System.out.println("Некорректный номер месяца");
            }
        }
    }
}