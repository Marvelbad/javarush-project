package ru.javarush.java.core.level05.task18;

public class Solution {
    public static void main(String[] args) {
        // Начинаем с числа 1
        int number = 1;

        // Используем цикл while для перебора чисел
        while (true) {
            // Проверяем, делится ли текущее число на 7 без остатка
            if (number % 7 == 0) {
                // Если делится, выводим результат
                System.out.println("Первое число, кратное 7: " + number);
                // Завершаем цикл с помощью break
                break;
            }
            // Увеличиваем число на 1
            number++;
        }
    }
}