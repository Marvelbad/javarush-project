package ru.javarush.java.core.level21.task11;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void printTwice(String message) {
        Printer.super.printTwice(message);
    }
}
