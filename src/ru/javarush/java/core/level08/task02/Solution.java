package ru.javarush.java.core.level08.task02;

public class Solution {
    public static void main(String[] args) {
        // Вызовем наш "калькулятор": сложим 7 и 5 и выведем результат
        MathMagic.showSum(7,5);
    }
}

// Класс-инструмент для простых математических операций
class MathMagic {
    // Статический метод принимает два int, считает сумму и выводит её
    public static void showSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}