package ru.mirea.task16;

import javax.swing.*;

public class registeredForm extends JFrame {

    private JPanel registerPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton button1;
    private JComboBox comboBox1;

    public registeredForm () {
        setTitle("Registration");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

        setVisible(true);
        setSize(300, 500);
    }
}
