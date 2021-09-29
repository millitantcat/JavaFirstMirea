package ru.mirea.task5.second;

public class ChauChau extends Dog
{
    private String burnt;

    public ChauChau(String color, String size, String burnt)
    {
        super(color, size);
        this.burnt = burnt;
    }

    public ChauChau(String color, String size)
    {
        super(color, size);
    }

    @Override
    public String toString()
    {
        return ("It's a " +size+" size " +color+ " " +burnt+ " Chau-Chau.");
    }
}