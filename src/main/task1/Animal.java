package main.task1;

public abstract class Animal {
    static int count=0;
    private String name;
    private int maxRun;
    private int maxSwim;

    private final int id;

    public int getId() {
        return id;
    }

   {
        id = ++count;
    }

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

    public void swim(int distance) {
        if(distance<=getMaxSwim()){
            System.out.printf("%s swim through the %d %d m\n", getName(), distance, id);
        }else{
            System.out.printf("%s not swim through the %d %d m\n",getName(), distance,id);
        }
    }
    public void run(int distance) {
        if(distance<=getMaxRun()){
            System.out.printf("%s rum %d %d m\n", getName(), distance, id);
        }else{
            System.out.printf("%s not run %d  %d m\n",getName(), distance, id);
        }
    }
}
