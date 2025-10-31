package ru.javarush.java.core.level21.task14;

public interface Printer {
    void print(String text);

    static void printHello(Printer printer) {
        printer.print("Hello World!");
    }
}
