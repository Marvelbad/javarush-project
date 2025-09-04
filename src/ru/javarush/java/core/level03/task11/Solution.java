package ru.javarush.java.core.level03.task11;

public class Solution {
    public static void main(String[] args) {
        // Исходные условия (можно менять для проверки разных вариантов)
        boolean isSunny = true;
        boolean isWeekend = false;

        // В парк идём только если одновременно солнечно И выходные
        boolean canGoToPark = isSunny && isWeekend;

        // Остаёмся дома, если НЕ солнечно ИЛИ НЕ выходные
        boolean canStayHome = !isSunny || !isWeekend;

        // Вывод значений на экран
        System.out.println("canGoToPark = " + canGoToPark);
        System.out.println("canStayHome = " + canStayHome);

    }
}