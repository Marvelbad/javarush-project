package ru.javarush.java.core.level17.task12;

public class Student extends Person {


    public Student(String studentName, int studentGrade) {
        super(studentName);
        System.out.printf("Создан студент: %s, класс: %d", studentName, studentGrade);
    }
}
