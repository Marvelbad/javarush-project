package ru.javarush.java.core.level19.task16;

public class OfflineOrder extends Order {

    public OfflineOrder(double amount) {
        this.amount = amount;
    }

    @Override
    void process() {
        System.out.printf("Обработка оффлайн-заказа на сумму %.2f", amount);
    }
}
