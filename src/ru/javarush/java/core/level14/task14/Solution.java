package ru.javarush.java.core.level14.task14;

public class Solution {
    public static void main(String[] args) {
        User first = new User();
        User second = new User("Алиса");

        System.out.println(first.userName);
        System.out.println(first.userAge);
        System.out.println(second.userName);
        System.out.println(second.userAge);
    }
}
