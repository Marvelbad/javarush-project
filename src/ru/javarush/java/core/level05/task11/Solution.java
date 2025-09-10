package ru.javarush.java.core.level05.task11;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1; // 1..100
        Scanner console = new Scanner(System.in);
        int N = 10;
        // Игра с духом
        while (true) {
            System.out.println("Enter digit:");
            int guess = console.nextInt();

            if (guess < secret) {
                System.out.println("Больше!");
            } else if (guess > secret) {
                System.out.println("Меньше!");
            } else {
                System.out.println("Верно");
                break;
            }
        }
    }
}