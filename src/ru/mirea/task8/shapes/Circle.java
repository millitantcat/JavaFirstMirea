package ru.mirea.task8.shapes;

import java.awt.Graphics;

public class Circle extends Shape {
    Circle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
    }

    @Override
    public void paint(Graphics g){
        getColor();
        g.fillOval(getX1(), getY1(), getX2(), getY2());
    }

}