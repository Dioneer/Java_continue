package main.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Dog extends Animal{
    private static final AtomicInteger count= new AtomicInteger();
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
    {
        count.getAndIncrement();
    }
    public Dog(String name) {
        super(name, 200, 200);
    }
    public static int getCount() {
        return count.get();
    }
    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName()+ '\'' +
                ", maxRun=" + getMaxRun() +
                ", maxSwim=" + getMaxSwim() +
                '}';
    }
}
