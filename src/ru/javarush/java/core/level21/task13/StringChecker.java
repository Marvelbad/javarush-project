package ru.javarush.java.core.level21.task13;

public interface StringChecker {
    static boolean isEmpty(String text) {
        if (text == null || text.length() == 0) {
            return true;
        }
        return false;
    }
}
