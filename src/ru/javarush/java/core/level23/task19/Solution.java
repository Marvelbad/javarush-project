package ru.javarush.java.core.level23.task19;

public class Solution {
    // Константа налоговой ставки. Так понятнее и безопаснее, чем "магическое число" 0.13 в коде.
    static final double INCOME_TAX_RATE = 0.13;
    double employeeSalary = 5000.0;

    public void calculatedTax() {
        System.out.println(employeeSalary * INCOME_TAX_RATE);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.calculatedTax();
    }
}