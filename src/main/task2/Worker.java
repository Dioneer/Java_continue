package main.task2;

public class Worker extends Employee{
    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }

    @Override
    public String toString(){
        return String.format("%s - %s - %.1f", getSurName(), getName(), getSalary());
    }
}
