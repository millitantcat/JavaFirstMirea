package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginForm extends JFrame {
    private JPanel loginPanel;
    private JTextField loginField;
    private JLabel loginLabel;
    private JButton buttonAuth;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JCheckBox showPasswordCheckBox;
    private JLabel newAccountLabel;
    //глобальные переменные
    public static String logValue;
    public static String pasValue;

    public loginForm(){
        super();
        setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.pack();
        this.setLocationRelativeTo(null);

        //размер окна
        setSize(285, 180);

        //получение логина
        loginField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logValue = loginField.getText();
                loginField.selectAll();

                System.out.println(logValue);
            }
        });
        //получение пароля
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasValue = passwordField.getText();
                passwordField.selectAll();

                System.out.println(pasValue);
            }
        });

        System.out.println(logValue);
        System.out.println(pasValue);

        //обработчик для кнопки
        buttonAuth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (logValue == "admin" && pasValue == "1111") {
                    JOptionPane.showMessageDialog(null, "Работает!");
                }
                else
                    JOptionPane.showMessageDialog(null, "Не работает!");
            }
        });

        //показать/скрыть пароль
        showPasswordCheckBox.addActionListener(new ActionListener() {
            char def = passwordField.getEchoChar();
            @Override
            public void actionPerformed(ActionEvent e) {
                if (showPasswordCheckBox.isSelected())
                    passwordField.setEchoChar('\0');
                else
                    passwordField.setEchoChar(def);
            }
        });

        //переход на форму регистрации аккаунта
        newAccountLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                registeredForm rgf = new registeredForm();
                rgf.setVisible (true);
                rgf.pack();
                rgf.setLocationRelativeTo(null);
                rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                rgf.setSize(300, 500);
                //скрытие окна логина
                setVisible(false);
            }
        });

        //немного красивостей (или нет)
        newAccountLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                newAccountLabel.setForeground(Color.getColor("#0000CD"));
            }
        });
    }
}
