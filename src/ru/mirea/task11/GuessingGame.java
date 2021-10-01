package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GuessingGame extends JFrame{
    int cnt = 0;
    JButton play = new JButton("ИГРАТЬ!");
    JTextField number = new JTextField(2);
    JLabel message = new JLabel("Введите число здесь");
    int hiddenNumber = (int) (Math.random() * 20);

    public GuessingGame() {
        super("Guess");
        setLayout(null);
        setSize(400, 200);
        Font font = new Font("Times New Roman", Font.PLAIN, 20);
        add(play);
        play.setBounds(150,  100, 100, 40);

        add(number);
        number.setBounds(180, 60, 40, 20);

        add(message);
        message.setVerticalAlignment(JLabel.CENTER);
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setBounds(100, 20, 200, 20);
        message.setFont(font);
        play.addMouseListener(new MouseListener() {

            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                try {
                    cnt++;
                    if (hiddenNumber == Integer.parseInt(number.getText()) && cnt <= 3) {
                        JOptionPane.showMessageDialog(null, "Загаданное число: " + hiddenNumber + " Вы выиграли!");
                    } else if (cnt < 3 && hiddenNumber > Integer.parseInt(number.getText())) {
                        JOptionPane.showMessageDialog(null, "Ваше число меньше загаданного");
                    } else if (cnt < 3 && hiddenNumber < Integer.parseInt(number.getText())) {
                        JOptionPane.showMessageDialog(null, "Ваше число больше загаданного");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Загаданное число: " + hiddenNumber + " Вы проиграли!");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Введите число!");
                }
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });
    }

    public static void main(String[] args) {
        new GuessingGame().setVisible(true);
    }
}


// frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);