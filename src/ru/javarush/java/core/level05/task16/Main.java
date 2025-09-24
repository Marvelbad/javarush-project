package ru.javarush.java.core.level05.task16;

// Импортируем класс java.util.Date
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создаем объект java.util.Date и присваиваем ему текущую дату и время
        Date util = new Date();

        // Создаем объект java.sql.Date, используя полное имя класса, и присваиваем ему текущую дату
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

        // Выводим оба объекта на консоль
        System.out.println(util);
        System.out.println(sqlDate);
    }
}