package ru.mirea.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String name;
        int age;
        Scanner scan = new Scanner(System.in);
        TestDog doggu = new TestDog();
        name = scan.next();
        while(!(name.equals("stop"))) {
            age = scan.nextInt();
            Dog d = new Dog(name, age);
            d.intoHumanAge();
            System.out.println(d.toString());
            doggu.dogAdd(name, age);
            name = scan.next();
        }
        doggu.dogsShow();

        Ball b1 = new Ball("White", 43);
        Ball b2 = new Ball("Orange");
        Ball b3 = new Ball();
        b3.setColor("Purple");
        b3.setDim(15);
        b1.OutSC();
        b2.OutSC();
        b3.OutSC();

        Book bo1 = new Book("White noise", 43);
        Book bo2 = new Book("One piece");
        Book bo3 = new Book();
        bo3.setName("World of seas");
        bo3.setPages(125);
        bo1.OutNP();
        bo2.OutNP();
        bo3.OutNP();
    }
}