package ru.javarush.java.core.level22.task15;

public record Person(String name, int age) {
    public static final String SPECIES = "Homo sapiens";

    public String greeting() {
        return String.format("Привет, меня зовут %s, мне %d лет. Я — %s", name, age, SPECIES);
    }
}