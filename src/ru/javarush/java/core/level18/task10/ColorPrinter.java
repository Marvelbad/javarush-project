package ru.javarush.java.core.level18.task10;

public class ColorPrinter extends Printer {

    @Override
    public void print(String str) {
        System.out.println("Цветная строка: " + str);
    }
}
