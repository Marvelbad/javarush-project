package ru.javarush.java.core.level20.task18;

public class Solution {
    public static void main(String[] args) {
        // Внедряем реализацию EmailSender в Notification
        MessageSender emailSender = new EmailSender();
        Notification notification = new Notification(emailSender);

        // Тестируем отправку уведомления
        notification.notifyUser("Привет!"); // Ожидаемый вывод: "Email отправлен: Привет!"
    }

    static class EmailSender implements MessageSender {
        @Override
        public void send(String text) {
            System.out.println("Email отправлен: " + text);
        }
    }

    static class Notification {
        MessageSender sender;

        public Notification(MessageSender sender) {
            this.sender = sender;
        }

        public void notifyUser(String text) {
            sender.send(text);
        }
    }

    interface MessageSender {
        void send(String text);
    }
}