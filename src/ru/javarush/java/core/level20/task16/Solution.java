package ru.javarush.java.core.level20.task16;

public class Solution {
    public static void main(String[] args) {
        // Лямбда-реализация: преобразует строку к нижнему регистру
        StringTransformer transFormer = String::toLowerCase;

        // Вызываем default-метод для строки "JAVA ROCKS"
        transFormer.printTransformed("JAVA ROCKS");
    }

    @FunctionalInterface
    interface StringTransformer {
        String transform(String s);

        default void printTransformed(String s) {
            System.out.println(transform(s));
        }
    }
}