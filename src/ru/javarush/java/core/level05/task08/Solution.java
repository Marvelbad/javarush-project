package ru.javarush.java.core.level05.task08;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаём Scanner для чтения данных с клавиатуры
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 digits:");

        int pathOne;
        int pathTwo;
        int pathThree;
        // Считываем три целых числа — длительности трёх путей в минутах
        pathOne = console.nextInt();
        pathTwo = console.nextInt();
        pathThree = console.nextInt();

        // Определяем минимальную длительность среди трёх значений
        int min = Math.min(pathOne, Math.min(pathTwo, pathThree));

        // Выводим результат
        System.out.println(min);
    }
}