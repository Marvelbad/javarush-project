package ru.javarush.java.core.level02.task18;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем и считываем имя игрока
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        // Запрашиваем и считываем возраст игрока
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        // Сначала выводим возраст, затем имя, каждый с новой строки
        System.out.println(age);
        System.out.println(name);

    }
}