package ru.javarush.java.core.level20.task11;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект и вызываем его метод doAction()
        MultiAction action = new MultiAction();
        action.doAction();
    }

    static class MultiAction implements interfaceA, interfaceB {
        @Override
        public void doAction() {
            System.out.println("Выполнено действие для обоих интерфейсов");
        }
    }

    interface interfaceA {
        void doAction();
    }

    interface interfaceB {
        void doAction();
    }
}