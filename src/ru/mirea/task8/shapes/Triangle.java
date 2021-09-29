package ru.mirea.task8.shapes;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Triangle extends Shape {
    int x3, y3;
    Random random = new Random();
    public int[] x;
    public int[] y;

    Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2);
        setX3(x3);
        setY3(y3);
        int[] x = {getX1(), getX2(), getX3()};
        int[] y = {getY1(), getY2(), getY3()};
        setX(x);
        setY(y);
    }


    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    int n = 3;

    public void setX(int[] x){
        this.x = Arrays.copyOf(x, 3);
    }

    public void setY(int[] y){
        this.y = Arrays.copyOf(y, 3);
    }

    //@Override
    public void paint(Graphics g) {
        getColor();
        g.fillPolygon(x, y, n);
    }

}