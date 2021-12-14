package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
            }
        });
        //получение пароля
        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pasValue = passwordField.getText();
                passwordField.selectAll();
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
                setSize(300, 500);
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

        //кнопка входа
        buttonAuth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection con = myConnection.getConnection();
                PreparedStatement ps;
                ResultSet rs;

                try {
                    ps = con.prepareStatement("SELECT `login`, `name` FROM `user` WHERE `login` = ? AND `pass` = ?");
                    ps.setString(1, loginField.getText());
                    ps.setString(2, String.valueOf(passwordField.getPassword()));
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        //JOptionPane.showMessageDialog(null, "Logged!");
                        userForm ugf = new userForm();
                        ugf.setVisible (true);
                        ugf.pack();
                        ugf.setLocationRelativeTo(null);
                        ugf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        ugf.setSize(750, 500);
                        //установка имени в лейбле usernameLabel
                        ugf.usernameLabel.setText(rs.getString(1));
                        //скрытие окна логина
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Error!");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}