package ru.javarush.java.core.level04.task04;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем Scanner для чтения данных с консоли
        Scanner scanner = new Scanner(System.in);

        // Сумма всех введенных стоимостей
        double sum = 0;

        // Запрашиваем первую стоимость чашки кофе
        System.out.println("Введите стоимость:");
        int cost = scanner.nextInt();

        // Используем цикл while для продолжения ввода до тех пор, пока не будет введено отрицательное число
        while (cost >= 0) {
            // Добавляем введенную стоимость к общей сумме
            sum += cost;
            // Запрашиваем следующую стоимость
            System.out.println("Введите следующую стоимость:");
            cost = scanner.nextInt();
        }

        // Выводим итоговую сумму расходов на кофе (отрицательное значение в сумму не входит)
        System.out.println("Общая сумма расходов на кофе: " + sum);
    }
}