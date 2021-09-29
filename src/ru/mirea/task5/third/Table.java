package ru.mirea.task5.third;

public class Table extends Furniture
{
    public Table(String color, String size)
    {
        super(color, size);
        cost = 2000;
    }

    @Override
    public String toString()
    {
        return ("Это " +size+" размера " +color+ " стол.");
    }
}