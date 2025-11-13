package ru.javarush.java.core.level28.task08;

import java.util.EnumMap;

// Перечисление дней недели
enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class Solution {
    public static void main(String[] args) {
        // Специализированная карта для enum-ключей: работает быстро и экономит память
        EnumMap<Day, Integer> dayEnumMap = new EnumMap<>(Day.class);

        // Заполняем цены согласно условию
        dayEnumMap.put(Day.MON, 100);
        dayEnumMap.put(Day.TUE, 120);
        dayEnumMap.put(Day.SAT, 200);

        // Получаем цену на субботу и выводим на экран
        System.out.println(dayEnumMap.get(Day.SAT));
    }
}