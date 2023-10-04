package main.task2;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Worker[] workers = generateWorkers(8);
        for (Worker worker: workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers, new SortCompare());
        System.out.println();

        for (Worker worker: workers) {
            System.out.println(worker);
        }

//        int[] arr = new int[]{1,2,3,4,5,6};
//        Integer x= 5;
//        byte u = 5;
//        Boolean y = true;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(x.intValue());
//        System.out.println(y.booleanValue());
//        System.out.println(x.compareTo(Integer.parseInt(String.valueOf(u))));
    }
    private  static Random random = new Random();
    public static Worker generateWorker(){
        String[] names = new String[] {"Kolya", "Petya", "Vasya", "Dima", "Ivan", "Denis"};
        String[] surNames = new String[] {"Pupkin", "Pipkin", "Popkin","Zhopkin", "kopkin", "Kapkin"};
        int salaryIndex = random.nextInt(300,500);
        return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)],salaryIndex*100);
    }

    public static Worker[] generateWorkers(int counter){
        Worker[] workers = new Worker[counter+1];
        for (int i = 0; i <= counter; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }
}
