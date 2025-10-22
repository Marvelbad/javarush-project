package ru.javarush.java.core.level17.task18;

public class Child extends Parent {
    void demo() {
        System.out.println(familySecret);
        this.familySecret = 10;
    }
}
