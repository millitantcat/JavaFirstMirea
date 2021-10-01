package ru.mirea.task11.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{
    int count = 0; //счётчик
    int hiddenNumber = (int) (Math.random() * 20); //случайное числро

    JButton play = new JButton("Проверка!"); //кнопка
    JTextField number = new JTextField(2); //число
    JLabel message = new JLabel("Введите число здесь"); //лайбел

    public Frame() {
        //тайтл
        super("Угадайка");

        //окно
        setLayout(null);
        setSize(400, 200);
        Font font = new Font("Courier", Font.PLAIN, 20);

        //кнопка
        add(play);
        play.setBounds(150,  100, 100, 40);

        //поле для числа
        add(number);
        number.setBounds(165, 60, 70, 30);

        //лейбл
        add(message);
        message.setVerticalAlignment(JLabel.CENTER);
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(100, 20, 200, 20);
        message.setFont(font);

        //обработчик событий
        play.addMouseListener(new MouseListener() {

            public void mouseExited(MouseEvent a) {}

            public void mouseClicked(MouseEvent a) {
                try {
                    count++;
                    if (hiddenNumber == Integer.parseInt(number.getText()) && count <= 3) {
                        JOptionPane.showMessageDialog(null, "Загаданное число: " + hiddenNumber + " Вы выиграли!");
                    } else if (count < 3 && hiddenNumber > Integer.parseInt(number.getText())) {
                        JOptionPane.showMessageDialog(null, "Ваше число меньше загаданного");
                    } else if (count < 3 && hiddenNumber < Integer.parseInt(number.getText())) {
                        JOptionPane.showMessageDialog(null, "Ваше число больше загаданного");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Загаданное число: " + hiddenNumber + " Вы проиграли!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Введите число!");
                }
            }

            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        System.out.print("Its work!!!");
        new Frame().setVisible(true);
    }
}