package ru.javarush.java.core.level05.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения строки с клавиатуры
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        // Проверяем палиндром двумя указателями: с начала и с конца

        boolean isPalindrome = true;
        for (int i = 0, j = text.length() - 1; i < j; i++, j--) {
            // Проверка чувствительна к регистру, сравниваем символы напрямую
            if (text.charAt(i) != text.charAt(j)) {
                isPalindrome = false;
                break; // Дальше проверять не нужно
            }
        }

        // Вывод строго "YES" или "NO" без дополнительных сообщений
        System.out.println(isPalindrome ? "YES" : "NO");
    }
}