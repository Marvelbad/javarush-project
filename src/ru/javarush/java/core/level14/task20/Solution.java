package ru.javarush.java.core.level14.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаем объект класса Student
        Student newStudent = new Student();
    }

}
    class Student {
        int studentGrade = 1;

        {
            // Выводим текущую оценку
            System.out.println("Блок 1: grade = " + studentGrade);
            // Устанавливаем значение оценки в 5
            studentGrade = 5;
        }

        // Второй блок инициализации
        {
            // Выводим текущую оценку
            System.out.println("Блок 2: grade = " + studentGrade);
        }
    }
