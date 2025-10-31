package ru.javarush.java.core.level21.task19;

import javax.swing.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Создаем список товаров с разными названиями и ценами
        List<Product> products = new ArrayList<>();
        products.add(new Product("Телевизор", 55000));
        products.add(new Product("Телефон", 35000));
        products.add(new Product("Ноутбук", 80000));

        // Временная сортировка по названию.
        products.sort(Product.byName);

        // Вывод отсортированного списка (по алфавиту названий)
        for (Product p : products) {
            System.out.println(p);
        }
    }
}