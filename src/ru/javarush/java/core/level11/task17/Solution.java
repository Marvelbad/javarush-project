package ru.javarush.java.core.level11.task17;

public class Solution {
    public static void main(String[] args) {
        // Намеренно выполняем деление 10 на 0, чтобы вызвать ArithmeticException
        int res = 10 / 0;

        // Этот код не будет выполнен, так как программа завершится с ошибкой
        System.out.println(res);
    }
}