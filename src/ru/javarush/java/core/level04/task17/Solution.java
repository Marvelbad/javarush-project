package ru.javarush.java.core.level04.task17;

public class Solution {
    public static void main(String[] args) {
        // Внешний цикл для строк (i от 0 до 2)
        for (int i = 0; i < 3; i++) {
            // Внутренний цикл для столбцов (j от 0 до 3)
            for (int j = 0; j < 4; j++) {
                // Вывод координат текущей ячейки в формате i,j
                System.out.print(i + "," + j);
                // Добавляем пробел между координатами в строке, кроме последней
                if (j < 3) {
                    System.out.print(" ");
                }
            }
            // Переход на новую строку после завершения внутреннего цикла
            System.out.println();
        }
    }
}