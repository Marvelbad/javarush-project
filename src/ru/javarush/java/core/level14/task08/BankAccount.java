package ru.javarush.java.core.level14.task08;

public class BankAccount {
    private String accountOwner;
    private int accountBalance;

    public BankAccount(String accountOwner, int accountBalance) {
        this.accountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        this.accountBalance = 0;
    }

    void deposit(int amount) {
        this.accountBalance += amount;
    }

    void printInfo() {
        System.out.printf("Владелец: %s, баланс: %d %n", accountOwner, accountBalance);
    }
}
