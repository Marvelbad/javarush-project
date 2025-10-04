package ru.javarush.java.core.level14.task09;

public class Cat {
    private String catName;
    private int catAge;

    public Cat(String catName, int catAge) {
        this.catName = catName;
        this.catAge = catAge;
    }

   public void printInfo() {
        System.out.printf("Name: %s Age: %d года", catName, catAge);
    }
}
