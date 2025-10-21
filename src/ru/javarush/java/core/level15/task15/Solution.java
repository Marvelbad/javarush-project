package ru.javarush.java.core.level15.task15;

public class Solution {
    public static void main(String[] args) {
        // Выводим значение языка по умолчанию, обращаясь к полю через имя класса
        System.out.println(ApplicationConfiguration.APPLICATION_DEFAULT_LANGUAGE);
    }

    public static class ApplicationConfiguration {
            public static final String APPLICATION_DEFAULT_LANGUAGE;
        static {
            String appLang = System.getenv("APP_LANG");
            if (appLang != null) {
                APPLICATION_DEFAULT_LANGUAGE = appLang;
            } else {
                APPLICATION_DEFAULT_LANGUAGE = "en";
            }
        }
    }
}