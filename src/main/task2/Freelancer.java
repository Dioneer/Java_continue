package main.task2;

public class Freelancer extends Employee{
    private double days;
    public Freelancer(String name, String suerName, double salary,double days) {
        super(name, suerName, salary);
        this.days = days;
    }

    @Override
    public double calculateSalary() {
        return getSalary()*this.days;
    }
}
