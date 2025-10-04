package ru.javarush.java.core.level14.task16;

public class Solution {
    public static void main(String[] args) {
        Student first = new Student("Alex", "One", 20);
        Student second = new Student("Ivan", "Two");
        Student third = new Student("Sergey");
        Student fourth = new Student();

        first.printInfo();
        second.printInfo();
        third.printInfo();
        fourth.printInfo();
    }
}
