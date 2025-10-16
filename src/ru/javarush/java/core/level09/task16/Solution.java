package ru.javarush.java.core.level09.task16;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные с email-адресами
        String emailOne = "User@Example.com";
        String emailTwo = "user@example.com";

        // Сравниваем email-адреса без учёта регистра
        boolean emailsEqual = emailOne.equalsIgnoreCase(emailTwo);

        // Создаем сообщение о регистрации пользователя
        String registrationMessage = "user@example.com is registered";

        // Проверяем, содержит ли сообщение подстроку "example"
        boolean containsExample = registrationMessage.contains("example");

        // Выводим оба результата в одной строке через пробел
        System.out.println(emailsEqual + " " + containsExample);

    }
}