package ru.javarush.java.core.level14.task08;

public class Solution {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount("Alex", 1000);
        BankAccount accountTwo = new BankAccount("Ivan");

        accountTwo.deposit(500);
        accountTwo.printInfo();
        accountOne.printInfo();
    }
}
