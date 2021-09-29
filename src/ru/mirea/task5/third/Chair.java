package ru.mirea.task5.third;

public class Chair extends Furniture
{
    public Chair(String color, String size)
    {
        super(color, size);
        cost = 1000;
    }

    @Override
    public String toString()
    {
        return ("Это " +size+" размера " +color+ " стул");
    }
}