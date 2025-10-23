package ru.javarush.java.core.level19.task16;

public class OnlineOrder extends Order {

    public OnlineOrder(double amount) {
        this.amount = amount;
    }

    @Override
    void process() {
        System.out.printf("Обработка онлайн-заказа на сумму %.2f%n", amount);
    }
}
