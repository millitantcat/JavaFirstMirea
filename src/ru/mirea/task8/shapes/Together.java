package ru.mirea.task8.shapes;
import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Together extends JComponent {
    Graphics g;
    Graphics2D g2d = (Graphics2D) g;

    public void together() {
        int f_case;
        int k;

        Random random = new Random();
        int x1 = (int) (Math.random() * 50);
        int y1 = (int) (Math.random() * 50);
        int x2 = (int) (Math.random() * 50);
        int y2 = (int) (Math.random() * 50);
        int x3 = (int) (Math.random() * 50);
        int y3 = (int) (Math.random() * 50);

        for (k = 0; k < 20; k++) {
            k++;
            f_case = (int) (Math.random() * 3);
            switch (f_case) {
                case (1):
                    y2 = x2;
                    Circle circle = new Circle(x1, y1, x2, y2);
                    circle.paint(g);
                    break;
                case (0):
                    Rectangle rect = new Rectangle(x1, x2, y1, y1);
                    rect.paint(g);
                    break;
                case (2):
                    Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
                    triangle.paint(g);
                    break;
                default:
                    break;
            }
        }
    }
}