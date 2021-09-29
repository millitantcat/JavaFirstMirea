package ru.mirea.task3;

import java.lang.*;

public class Leg
{
    private int numOfLegs;

    public Leg(int numOfLegs)
    {
        this.numOfLegs = numOfLegs;
    }

    public Leg()
    {
        this.numOfLegs = 2;
    }

    public void Crisp()
    {
        System.out.println("Вы стараетесь идти как можно тише...");
    }
}