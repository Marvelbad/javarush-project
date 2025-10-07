package ru.javarush.java.core.level08.task20;

public class Solution {
    public static void main(String[] args) {
        // Создаём новую запись об ученике
        SchoolStudent newPupil = new SchoolStudent();

        // Имя можно присвоить напрямую — поле публичное
        newPupil.studentName = "Мария";

        // Возраст задаётся только через публичный метод (инкапсуляция)
        newPupil.setStudentAge(16);

        // Выведем аккуратный профиль ученика
        newPupil.displayStudentProfile();

        // Попытка прямого изменения приватного поля — это нарушение инкапсуляции.
        newPupil.studentAge = 8;
    }
}

// Класс описывает ученика школы
class SchoolStudent {
    // Имя ученика доступно всем — публичное поле
    public String studentName;

    // Возраст ученика — чувствительная информация, скрытая от прямого доступа
    private int studentAge;

    // Публичный метод позволяет корректно установить возраст
    public void setStudentAge(int ageToSet) {
        this.studentAge = ageToSet;
    }

    // Аккуратно выводим профиль ученика
    public void displayStudentProfile() {
        System.out.println(studentName + " " + studentAge);
    }
}