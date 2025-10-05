package ru.javarush.java.core.level08.task05;

public class PersonalGreeter {
    // Статический метод для приветствия нового пользователя
    public static void welcomeNewUser(String userName) {
        // Формируем строку приветствия и выводим её на экран
        String welcome = "Приветствуем тебя, ";
        System.out.println(welcome += userName);
    }

    public static void main(String[] args) {
        // Вызываем метод welcomeNewUser с именем "Аня"
        welcomeNewUser("Аня");
    }
}