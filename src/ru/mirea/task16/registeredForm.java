package ru.mirea.task16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class registeredForm extends JFrame {

    private JPanel regPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton Registration;
    private JComboBox comboBox1;
    private JButton backButton;
    private JButton regButton;
    private JLabel nameLabel;
    private JLabel passwordLabel;
    private JLabel rePasswordLabel;
    private JLabel enterYourBDLabel;
    private JCheckBox showPasswordCheckBox;

    public registeredForm () {
        super();
        setTitle("Registration");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setContentPane(regPanel);

        setVisible(true);
        setSize(300, 500);

        //back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                loginForm log = new loginForm();
                log.setVisible(true);
            }
        });
        showPasswordCheckBox.addActionListener(new ActionListener() {
            char def = passwordField1.getEchoChar();
            char def2 = passwordField2.getEchoChar();
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected()){
                    passwordField1.setEchoChar('\0');
                    passwordField2.setEchoChar('\0');
                }
                else {
                    passwordField1.setEchoChar(def);
                    passwordField2.setEchoChar(def2);
                }
            }
        });
    }
}
