package ru.javarush.java.core.level27.task05;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        // Создаем очередь задач на основе LinkedList
        Queue<Integer> tasks = new LinkedList<>();

        // Добавляем идентификаторы задач в указанном порядке
        tasks.offer(5);
        tasks.offer(15);
        tasks.offer(25);

        // Получаем первый элемент без удаления из очереди (peek не изменяет очередь)
        Integer peek = tasks.peek();

        // Выводим идентификатор следующей задачи
        System.out.println(peek);

        // Выводим текущий размер очереди
        System.out.println(tasks.size());
    }
}