package com.company;

public class Main {

    public static void main(String[] args) {

        Parrot parrot = new Parrot();

        Fish fish = new Fish("Nemo",3,"red");
        fish.getFishInfo();

        Dog dog = new Dog("Hatiko",5,"white");
        dog.getDogInfo();

        Cat cat = new Cat("Tom",3,"black");
        cat.getCatInfo();


    }
}
