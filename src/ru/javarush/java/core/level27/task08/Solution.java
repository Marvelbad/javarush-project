package ru.javarush.java.core.level27.task08;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        // Основной складской реестр: упорядоченное множество с навигационными методами
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Добавляем идентификаторы товаров
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        // Формируем "вид" на часть реестра: от 20 (включительно) до 50 (исключительно)
        // subSet в NavigableSet возвращает представление (view), связанное с исходным множеством
        NavigableSet<Integer> shipment = numbers.subSet(20, true, 50, false);

        // Удаляем поврежденный товар 30 из временного списка — изменение отразится и в реестре
        shipment.remove(30);

        // Сначала выводим временный список отгрузки, затем основной реестр
        System.out.println(shipment);
        System.out.println(numbers);
    }
}