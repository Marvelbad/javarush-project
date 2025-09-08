package ru.javarush.java.core.level05.task01;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner console = new Scanner(System.in);

        // Запрашиваем у пользователя высоту лестницы
        System.out.println("Укажите высоту:");
        int ladderHeight = console.nextInt();

        // Внешний цикл — по количеству ступеней (строк)
        for (int step = 1; step <= ladderHeight; step++) {
            // Внутренний цикл — печатает нужное количество символов '#'
            for (int i = 0; i < step; i++) {
                System.out.print("#");
            }
            // Переход на новую строку после каждой ступеньки
            System.out.println();
        }
    }
}