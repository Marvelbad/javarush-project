package ru.javarush.java.core.level05.task03;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Просим пользователя ввести строку (послание)
        System.out.println("Введите строку:");
        String magicMessage = console.nextLine();

        // Разворачиваем строку с помощью цикла for
        String reversed = "";
        for (int i = magicMessage.length() - 1; i >= 0; i--) {
            reversed += magicMessage.charAt(i);
        }

        // Выводим инвертированную строку
        System.out.println(reversed);
    }
}