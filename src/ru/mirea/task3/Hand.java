package ru.mirea.task3;

public class Hand
{
    private int numOfFingers;

    public Hand(int numOfFingers)
    {
        this.numOfFingers = numOfFingers;
    }

    public Hand()
    {
        this.numOfFingers = 5;
    }

    public void Clap()
    {
        System.out.println("Вы ощущаете, как что-то машет вам");
    }
}