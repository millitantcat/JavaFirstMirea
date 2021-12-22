package ru.mirea.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String form = "square";
        String size = "large";
        Shape s = new Shape(form, size);
        System.out.println(s);

        int dim = 15;
        String color = "Red";
        Ball b = new Ball(dim, color);
        System.out.println(b);

        Book book = new Book();
        System.out.println(book);

        String name;
        int age;
        Scanner scan = new Scanner(System.in);
        TestDog dog = new TestDog();
        name = scan.next();
        while(!(name.equals("stop")))
        {
            age = scan.nextInt();
            Dog d = new Dog(age, name);
            d.toHumanAge();
            System.out.println(d.toString());
            dog.dogAdd(name, age);
            name = scan.next();
        }
        dog.dogsShow();
    }
}