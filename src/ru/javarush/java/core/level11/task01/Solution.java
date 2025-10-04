package ru.javarush.java.core.level11.task01;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменные согласно условию
        int totalEnergy = 100;
        int divisor = 0;
        // Попытка выполнить деление на ноль.
        // В момент вычисления этой строки произойдет ArithmeticException: / by zero
        try {
            int result = totalEnergy / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }

        // Попытка вывести результат деления (до этой строки выполнение не дойдет из-за исключения выше)
    }
}