package main.task1;

import java.util.concurrent.atomic.AtomicInteger;

public class Cat extends Animal{
    private static final AtomicInteger count= new AtomicInteger();
    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
    public Cat(String name) {
        super(name, 200, 0);
    }
    {
        count.getAndIncrement();
    }
    @Override
    public void swim(int ditance){
        System.out.println("Cat "+getName()+" can't swim");
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
