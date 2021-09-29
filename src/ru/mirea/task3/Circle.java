package ru.mirea.task3;

public class Circle
{
    protected double radius;

    public Circle()
    {
        radius = 20.0;
    }

    public Circle(double rad)
    {
        radius = rad;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    public String toString()
    {
        return "Circle's area = "+this.getArea()+"\nCircle's perimeter = "+this.getPerimeter();
    }
}