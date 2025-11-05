package ru.javarush.java.core.level24.task06;

public class PasswordGuard {

    public static void enforcePasswordStrength(String password) throws WeakPasswordException {
        if (password.length() < 6) {
            throw new WeakPasswordException("Пароль слишком короткий!");
        }
    }
}