package main.task2;

public abstract class Employee {
    private String name;
    private String sureName;
    private double salary;

    public Employee(String name, String sureName, double salary) {
        this.name = name;
        this.sureName = sureName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSuerName() {
        return sureName;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
