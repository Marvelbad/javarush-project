package ru.javarush.java.core.level22.task16;

public record Transaction(String sender, String recipient, double amount) {

    public Transaction {
        if (sender == null || sender.isBlank()) throw new IllegalArgumentException("Отправитель не должен быть пустым");
        if (recipient == null || recipient.isBlank()) throw new IllegalArgumentException("Получатель не должен быть пустым");

        if (amount <= 0) throw new IllegalArgumentException("Сумма должна быть положительной");
    }

    public String describe() {
        return String.format("Перевод %.2f от %s к %s", amount, sender, recipient);
    }
}