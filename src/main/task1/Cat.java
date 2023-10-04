package main.task1;

public class Cat extends Animal{

    private static int counter=0;

    public static int getCounter() {
        return counter;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }
    public Cat(String name) {
        this(name, 200, 500);
    }

    {
        counter++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.getClass().getSimpleName() + " can't swim");
    }
    @Override
    public String toString(){
        return String.format("class cat %s %d %d", super.getName(), super.getMaxRun(), super.getMaxSwim());
    }
}
