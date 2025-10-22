package ru.javarush.java.core.level19.task04;

public class PaypalPayment extends Payment {

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void process() {
        System.out.println("Обработка платежа через PayPal");
    }
}
