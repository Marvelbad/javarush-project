package ru.javarush.java.core.level24.task07;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
        System.out.println("Не подходит по возрасту");
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
