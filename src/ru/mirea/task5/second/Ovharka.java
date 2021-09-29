package ru.mirea.task5.second;

public class Ovharka extends Dog
{
    public Ovharka(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " ovcharka.");
    }
}