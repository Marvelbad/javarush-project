package ru.javarush.java.core.level02.task16;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные типа int и инициализируем их начальными значениями
        int account1 = 100;
        int account2 = 200;

        // Переводим деньги с account1 на account2
        account2 += account1;
        account1 = 0;

        // На счет 1 приходит бонус в размере 50 и мы увеличиваем account1 на 50
        account1 += 50;

        // Выводим на экран конечные значения обеих переменных
        System.out.println(account2);
        System.out.println(account1);

    }
}