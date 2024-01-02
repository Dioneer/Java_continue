package main.task2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static Random random = new Random();
    private static Worker generateWorker(){
        String[] name = {"Tosha", "Killy", "Filly", "Oin", "Gloin", "Dorry", "Norry"};
        String[] sureName = {"Toshaba", "Killyba", "Fillyba", "Oinba", "Gloinba", "Dorryba", "Norryba"};
        int salaryIndex = random.nextInt(300, 500);
        return new Worker(name[random.nextInt(name.length)],sureName[random.nextInt(sureName.length)], salaryIndex*100);
    }

    public static Worker[] generateWorkers(int count){
        Worker[] arr = new Worker[count];
        for (int i = 0; i<count; i++){
            arr[i] = generateWorker();
        }
        return arr;
    }
    public static void main(String[] args) {
//        for(Worker i: generateWorkers(5)){
//            System.out.println(i);
//        }
        Worker[] arr = generateWorkers(5);
        Arrays.sort(arr, new MyComparator());
        for(Worker i: arr){
            System.out.println(i);
        }
    }
}
