package ru.javarush.java.core.level27.task07;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        // Создаем NavigableMap, чтобы быстро находить порог по баллам
        NavigableMap<Integer, String> levels = new TreeMap<>();

        // Заполняем карту: ключ — минимальные баллы, значение — название уровня
        levels.put(1, "бронзовый");
        levels.put(3, "серебряный");
        levels.put(5, "золотой");
        levels.put(7, "платиновый");

        // Считываем количество баллов клиента
        int score = 4;
        int flooredKey = levels.floorKey(score);

        // Находим наибольший ключ, не превышающий количество баллов
        System.out.println(levels.get(flooredKey));

        // Получаем и выводим название уровня (если порога нет — выводим сообщение)

    }
}