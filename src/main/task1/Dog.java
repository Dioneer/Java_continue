package main.task1;

public class Dog extends Animal{
    private static int counter=0;

    public static int getCounter() {
        return counter;
    }
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
    {
        counter++;
    }
}
