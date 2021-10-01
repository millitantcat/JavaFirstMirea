package ru.mirea.task11.game;

import javax.swing.*;

public class Frame extends JFrame{
    private JButton button1;
    private JPanel rootPanel;
    private JTextField textField1;

    public Frame() {
        setContentPane(rootPanel);
        setVisible(true);
        setSize(400, 200);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Frame();
    }
}