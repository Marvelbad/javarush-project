package ru.javarush.java.core.level23.task16;

public class Programmer extends Worker implements Reportable {


    public Programmer(String employeeName) {
        super();
    }

    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }

    @Override
    public void report() {
        System.out.println("Программист сдаёт отчёт");
    }
}
