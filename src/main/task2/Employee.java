package main.task2;

public abstract class Employee {
    private String name;
    private String surName;
    private double salary;

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    public abstract double calculateSalary();
}
