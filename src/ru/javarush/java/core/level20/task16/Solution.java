package ru.javarush.java.core.level20.task16;

import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
        // Лямбда-реализация: преобразует строку к нижнему регистру
        StringTransFormer transFormer = s -> s.toLowerCase();

        // Вызываем default-метод для строки "JAVA ROCKS"
        transFormer.printTransformed("JAVA ROCKS");
    }

    @FunctionalInterface
    interface StringTransFormer {
        String transform(String s);

        default void printTransformed(String s) {
            System.out.println(transform(s));
        }
    }
}