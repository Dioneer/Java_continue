package main.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Vasik");
        Cat cat3 = new Cat("Pasha");
        Dog dog1 = new Dog("Bobik");
        Dog dog2 = new Dog("Blobik");
        Dog dog3 = new Dog("Bereg");
        Animal[] arr = new Animal[6];
        arr[0] = cat1; arr[1] = cat2; arr[2] = cat3;arr[3] = dog1;arr[4] = dog2;arr[5] = dog3;
        for(Animal animal:arr){
            animal.run(150);
            animal.swim(200);
        }
        System.out.println(Dog.getCount()+" "+Cat.getCount());
    }
}
