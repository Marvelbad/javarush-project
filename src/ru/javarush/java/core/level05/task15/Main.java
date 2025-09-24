package ru.javarush.java.core.level05.task15;


public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner, используя полное имя класса
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        // Считываем строку, введенную пользователем
        String s = scanner.nextLine();

        // Выводим считанную строку на экран
        System.out.println(s);
    }
}