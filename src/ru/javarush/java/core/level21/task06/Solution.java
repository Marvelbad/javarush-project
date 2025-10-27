package ru.javarush.java.core.level21.task06;

import java.io.PrintStream;
import java.util.function.Consumer;

public class Solution {
    public static void main(String[] args) {
        // Объявляем "отправителя" как Consumer<String>
        PrintStream print = System.out;
        Consumer<String> greet = print::println;

        // Используем отправителя для вывода сообщения (без прямого вызова System.out.println)
        greet.accept("Hello, method reference!");
    }
}