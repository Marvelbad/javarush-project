package ru.javarush.java.core.level19.task14;

public class SmsMessage extends Message {

    public SmsMessage(String text) {
        this.text = text;
    }

    @Override
    public void send() {
        System.out.println("Отправка SMS: " + text);
    }
}
