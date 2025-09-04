package ru.javarush.java.core.level03.task13;

public class Solution {
    public static void main(String[] args) {
        // Объявляем исходные булевы переменные
        boolean toTheSea = true;
        boolean hasPlaneTickets = false;
        boolean hasHotelRooms = true;

        // Важно: оператор && имеет более высокий приоритет, чем ||
        // Поэтому сначала вычисляется (hasPlaneTickets && hasHotelRooms), затем результат объединяется с toTheSea через ||
        boolean vacationHappened = toTheSea || hasPlaneTickets && hasHotelRooms;
        // Выводим результат на экран
        System.out.println(vacationHappened);
    }
}