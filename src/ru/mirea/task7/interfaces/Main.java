package ru.mirea.task7.interfaces;
import java.lang.*;

public class Main {
    public static void main(String[] args)
    {
        MovablePoint p = new MovablePoint(0,0,10,10);
        p.moveDown();
        p.moveRight();
        p.moveUp();
        p.moveUp();
        p.moveUp();
        p.moveUp();
        p.moveUp();
        System.out.println(p);

        MovableCircle c = new MovableCircle(0, 0,10,10,15);
        c.moveDown();
        c.moveRight();
        c.moveUp();
        c.moveUp();
        c.moveUp();
        c.moveUp();
        c.moveUp();
        System.out.println(c);

        MovableRectangle r = new MovableRectangle(0, 0,10,-10,15, 20);
        r.moveDown();
        r.moveRight();
        r.moveUp();
        r.moveUp();
        r.moveUp();
        r.moveUp();
        r.moveUp();
        System.out.println(r);
    }
}
