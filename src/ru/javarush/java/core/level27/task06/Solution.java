package ru.javarush.java.core.level27.task06;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Очередь печати на базе ArrayDeque (FIFO)
        Queue<String> printerFifo = new ArrayDeque<>();
        printerFifo.offer("Кот");
        printerFifo.offer("Пёс");
        printerFifo.offer("Мышь");

        // Стек истории действий на базе ArrayDeque (LIFO)
        Deque<Character> printerLifo = new ArrayDeque<>();
        // Используем push для добавления на вершину стека
        printerLifo.push('X');
        printerLifo.push('Y');
        printerLifo.push('Z');

        // Вывод очереди: сначала заголовок, затем извлекаем (poll) элементы в порядке FIFO
        System.out.println("Очередь:");
        while (!printerFifo.isEmpty()) {
            String displayPoll = printerFifo.poll();
            System.out.println(displayPoll);
        }

        // Вывод стека: сначала заголовок, затем снимаем (pop) элементы в порядке LIFO
        System.out.println("Стек:");
        while (!printerLifo.isEmpty()) {
            Character poll = printerLifo.pop();
            System.out.println(poll);
        }
    }
}