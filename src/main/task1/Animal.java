package main.task1;

public abstract class Animal {
    private String name;
    private int maxRun;
    private int maxSwim;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void run(int ditance){
        if(maxRun>=ditance){
            System.out.println(name+ " could run");
        }else{
            System.out.println(name+ " could not run");
        }
    }
    public void swim(int ditance){
        if(maxSwim>=ditance){
            System.out.println(name+ " could swim");
        }else{
            System.out.println(name+ " could not swim");
        }
    }

}
