package ru.javarush.java.core.level11.task20;

public class Solution {
    public static void main(String[] args) {
        // Начальная точка программы
        processInitialRequest();
    }

    public static void processInitialRequest() {
        handleIntermediateStep();
    }

    public static void handleIntermediateStep() {
        executeFinalAction();
    }

    public static void executeFinalAction() {
        int[] temporaryData = {1, 2};
        System.out.println(temporaryData[10]);
    }
}