package ru.javarush.java.core.level21.task13;

public interface StringChecker {
    static boolean isEmpty(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }
        return false;
    }
}
