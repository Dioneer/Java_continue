package main.task2;

public class Worker extends Employee{
    public Worker(String name, String suerName, double salary) {
        super(name, suerName, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }

}
