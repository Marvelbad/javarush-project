package ru.javarush.java.core.level14.task06;

public class Solution {
    public static void main(String[] args) {
        // "Зачисляем" нового студента, сразу задавая имя и оценку в конструкторе
        Student student = new Student("Ivan", 18);

        // Торжественно объявляем о его появлении
        student.greetingStudent();
    }
}

// Отдельный класс Student с полями и конструктором
class Student {
    private String studentName;
    private int studentGrade;

    public Student(String studentName, int studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    void greetingStudent() {
        System.out.printf("Имя: %s, оценка: %d", studentName, studentGrade);
    }
}