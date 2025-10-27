package ru.javarush.java.core.level21.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Исходный список результатов спортсменов
        List<Integer> list = Arrays.asList(-5, 3, -2, 7, 0);

        // Компаратор-лямбда: сравниваем числа только по их абсолютному значению (знак игнорируется)
        Comparator<Integer> comparator = (a, b) -> Math.abs(a) - Math.abs(b);

        // Сортируем список по возрастанию абсолютной величины
        list.sort(comparator);

        // Выводим отсортированный список
        System.out.println(list);
    }
}