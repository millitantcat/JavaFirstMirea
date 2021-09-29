package ru.mirea.task2;

import java.util.ArrayList;

public class TestDog {
    ArrayList<Dog> dogs = new ArrayList<Dog>();

    public void dogAdd(String name, int age) {
        dogs.add(new Dog(name, age));
    }

    public void dogsShow() {
        System.out.println(dogs);

    }
}