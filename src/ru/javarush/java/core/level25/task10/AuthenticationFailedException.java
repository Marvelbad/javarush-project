package ru.javarush.java.core.level25.task10;

public class AuthenticationFailedException extends SecurityBreachException {
    public AuthenticationFailedException(String message) {
        super(message);
    }

    public AuthenticationFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
