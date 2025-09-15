package ru.javarush.java.core.level05.task12;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int dragonHp = 50;
        int knightHits = 10;
        Scanner console = new Scanner(System.in);
        System.out.println("Вы напали на спящего дракона - дракон расстроился");

        // цикл боя
        while (knightHits > 0 && dragonHp > 0) {
            // Игрок указывает силу удара
            System.out.print("Сила удара (1-10): ");

            // Если слишком сильно или слишком слабо - то промах
            int dmg = console.nextInt();
            if (dmg < 1 || dmg > 10) {
                System.out.println("Вы промахнулись.");
                continue;
            }

            // отнимаем жизнь у дракона и ход у игрока
            dragonHp -= dmg;
            knightHits--;

            // проверка, что дракон побежден
            if (dragonHp <= 0) {
                System.out.println("Дракон повержен!");
                return;
            }
        }

        //проверка, что рыцарь проиграл
        if (dragonHp > 0) {
            System.out.println("Рыцарь проиграл!");
        }
    }
}