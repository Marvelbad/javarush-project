package ru.javarush.java.core.level19.task04;

public abstract class Payment {

    public abstract void process();

    public void printInfo() {
        System.out.println("Платёж обрабатывается");
    }
}
