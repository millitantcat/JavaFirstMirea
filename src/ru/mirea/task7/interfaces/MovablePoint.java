package ru.mirea.task7.interfaces;
import java.lang.*;

public class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString()
    {
        return "Точка была передвинута на координаты x = "+x+" и y = "+y;
    }

    @Override
    public void moveUp()
    {
        y += ySpeed;
    }

    @Override
    public void moveDown()
    {
        y -= ySpeed;
    }

    @Override
    public void moveLeft()
    {
        x -= xSpeed;
    }

    @Override
    public void moveRight()
    {
        x += xSpeed;
    }
}
