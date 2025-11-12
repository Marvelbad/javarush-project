package ru.javarush.java.core.level28.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем изменяемый список с начальными значениями
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, -3, 8, -1, 0, 4, -7));

        // Обходим список с помощью Iterator, чтобы безопасно удалять элементы во время обхода
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            if (number < 0) {
                it.remove();
            }
        }

        // Выводим обновленный список без отрицательных чисел
        System.out.println(numbers);
    }
}