package ru.javarush.java.core.level22.task14;

public record Email(String address) {

    public Email {
        if (address == null || address.isEmpty() || !address.contains("@")) {
            throw new IllegalArgumentException("Некорректный email: " + address);
        }
    }
}