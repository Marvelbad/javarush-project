package ru.javarush.java.core.level05.task14;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Стартовые очки здоровья
        int knightHp = 100;
        int dragonHp = 50;

        // Дракон загадывает скрытый максимум удара 2..20
        Random rand = new Random();
        int dragonMax = rand.nextInt(19) + 2;

        // Ввод силы удара рыцаря
        Scanner console = new Scanner(System.in);
        System.out.println("Битва началась! У рыцаря 100 жизней, у дракона 50 жизней.");

        // Основной боевой цикл
        while (true) {
            // Ход рыцаря: промах, если превышает скрытый максимум
            int hit;
            while (true) {
                System.out.print("Сила удара рыцаря (1-20): ");
                hit = console.nextInt(); // ожидаем целое число
                if (hit >= 1 && hit <= 20) break;
                System.out.println("Введите число от 1 до 20.");
            }
            int dealt = (hit <= dragonMax) ? hit : 0;
            if (dealt == 0) {
                System.out.println("Промах! Урон = 0");
            } else {
                dragonHp -= dealt;
                System.out.println("Рыцарь наносит " + dealt + " урона!");
            }

            // Проверяем смерть дракона
            if (dragonHp <= 0) {
                System.out.println("Жизни рыцаря: " + Math.max(0, knightHp));
                System.out.println("Жизни дракона: 0");
                System.out.println("Рыцарь победил!");
                break;
            }

            // Ход дракона: первая голова атакует
            int d1 = rand.nextInt(10) + 1;
            knightHp -= d1;
            System.out.println("Первая голова дракона наносит удар: " + d1 + " урона.");

            // Ход дракона: вторая голова атакует
            int d2 = rand.nextInt(10) + 1;
            knightHp -= d2;
            System.out.println("Вторая голова дракона наносит удар: " + d2 + " урона.");

            // Текущий статус и проверка смерти рыцаря
            System.out.println("Жизни рыцаря: " + Math.max(0, knightHp));
            System.out.println("Жизни дракона: " + Math.max(0, dragonHp));
            if (knightHp <= 0) {
                System.out.println("Дракон победил!");
                break;
            }
        }
    }
}