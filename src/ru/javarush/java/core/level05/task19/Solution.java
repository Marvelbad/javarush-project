package ru.javarush.java.core.level05.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Размер доски 8x8

        // Внешний цикл — по строкам
        for (int row = 0; row < size; row++) {
            // Внутренний цикл — по клеткам строки
            for (int col = 0; col < size; col++) {
                // Чередуем клетки по сумме индексов: чётная — "##", нечётная — "__"
                System.out.print(((row + col) % 2 == 0) ? "##" : "__");
            }
            // Перенос строки после каждой строки доски (без лишних пробелов)
            System.out.println();
        }
    }
}