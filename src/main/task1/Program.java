package main.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Animal> animals=new ArrayList<>(Arrays.asList(new Cat("Barsik"),
                new Cat("Parsik", 150, 600), new Dog("Bobik", 60, 900),
                new Dog("Archi", 900, 300)));

        for (Animal animal: animals) {
            animal.swim(300);
            animal.run(600);
        }
        System.out.println(Cat.getCounter());
        System.out.println(Dog.getCounter());
    }
}
