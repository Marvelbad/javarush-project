package ru.javarush.java.core.level20.task08;

public abstract class Appliance {

    public void turnOn() {
        System.out.println("Устройство включено");
    }

    public abstract void work();
}
