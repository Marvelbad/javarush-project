package ru.javarush.java.core.level05.task07;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с консоли
        Scanner console = new Scanner(System.in);
        System.out.println("Enter digits:");

        // Считываем большое число, введенное пользователем
        String s = String.valueOf(console.nextLine());

        // Выводим количество цифр в числе
        System.out.println(s.length());
    }
}