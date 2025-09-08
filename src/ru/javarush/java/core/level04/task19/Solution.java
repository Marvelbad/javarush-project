package ru.javarush.java.core.level04.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Размер игрового поля (8 строк и 8 столбцов)

        // Внешний цикл по строкам
        for (int row = 0; row < size; row++) {
            // Внутренний цикл по столбцам
            for (int col = 0; col < size; col++) {
                // Клетка белая, если сумма индексов четная; иначе — черная
                boolean sum = (row + col) % 2 == 0;
                if (sum) {
                    System.out.print("_");
                } else {
                    System.out.print("#");
                }
            }
            // Переход на новую строку после каждой строки поля
            System.out.println();
        }
    }
}