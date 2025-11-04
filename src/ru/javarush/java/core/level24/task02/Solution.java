package ru.javarush.java.core.level24.task02;

public class Solution {
    public static void main(String[] args) {
        // Общее исключение, которое можно обработать
        Exception generalSystemIssue = new Exception();

        // Фатальная ошибка, указывающая на проблему уровня JVM
        Error catastrophicFailure = new Error();

        // Проверяем на уровне классов: является ли класс переменной наследником Throwable
        boolean assignableFrom = Throwable.class.isAssignableFrom(generalSystemIssue.getClass());
        boolean catastrofa = Throwable.class.isAssignableFrom(catastrophicFailure.getClass());

        // Выводим результат проверки для каждой переменной
        System.out.println(assignableFrom);
        System.out.println(catastrofa);
    }
}