package main.task2;

import java.util.Comparator;

public class SortCompare implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
       return Double.compare(o2.calculateSalary(), o1.calculateSalary());
    }
}
