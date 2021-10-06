package ru.mirea.task7.interfaces;
import java.lang.*;

public class MovableCircle implements Movable
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString()
    {
        return "Круг с радиусом "+radius+" и центром в точке (0, 0) был передвинут на координаты x = "+center.x+" и y = "+center.y;
    }

    @Override
    public void moveUp()
    {
        center.moveUp();
    }

    @Override
    public void moveDown()
    {
        center.moveDown();
    }

    @Override
    public void moveLeft()
    {
        center.moveLeft();
    }

    @Override
    public void moveRight()
    {
        center.moveRight();
    }
}