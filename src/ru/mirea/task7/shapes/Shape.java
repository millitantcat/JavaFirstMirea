package ru.mirea.task7.shapes;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape()
    {
        color = "White";
        filled = true;
    }
    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    public String getColor()
    {
        return color;
    }
    public boolean getFilled()
    {
        return filled;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setFilled(boolean filled)
    {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
