package ru.javarush.java.core.level22.task11;

public record UserProfile(String name, int age) {
    @Override
    public String toString() {
        return "Пользователь: " + name + " (" + age + " лет)";
    }
}
