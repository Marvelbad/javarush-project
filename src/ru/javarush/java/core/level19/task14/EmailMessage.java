package ru.javarush.java.core.level19.task14;

public class EmailMessage extends Message {

    public EmailMessage(String text) {
        this.text = text;
    }

    @Override
    public void send() {
        System.out.println("Отправка email: " + text);
    }
}
