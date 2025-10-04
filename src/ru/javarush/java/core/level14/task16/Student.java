package ru.javarush.java.core.level14.task16;

public class Student {
    private String studentName;
    private String studentGroup;
    private int studentScore;

    public Student(String studentName, String studentGroup, int studentScore) {
        this.studentName = studentName;
        this.studentGroup = studentGroup;
        this.studentScore = studentScore;
    }

    public Student(String studentName, String studentGroup) {
        this(studentName, studentGroup, 0);
    }

    public Student(String studentName) {
        this(studentName, "Unknown", 0);
    }

    public Student() {
        this("Unknown", "Unknown", 0);
    }

    public void printInfo() {
        System.out.printf("Student: %s, Group: %s Score: %d %n", studentName, studentGroup, studentScore);
    }
}