package ru.javarush.java.core.level18.task07;

public class Greetings {

    public void sayHello(String text) {
        System.out.println("Hello, " + text + "!");
    }

    public void sayHello(String name, String lastName) {
        System.out.printf("Hello, %s %s!%n", name, lastName);
    }
}
