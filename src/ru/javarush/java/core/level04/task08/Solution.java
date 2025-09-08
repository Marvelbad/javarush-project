package ru.javarush.java.core.level04.task08;

public class Solution {
    public static void main(String[] args) {
        // Используем цикл for для одновременного изменения двух переменных
        int j = 6;
        for (int i = 1; i <= 5; i++) {
            j--;
            // На каждой итерации выводим текущие значения x и y через пробел
                System.out.println(i + " " + j);
            }
        }
    }