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

    public loginForm(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.pack();
        this.setLocationRelativeTo(null);

        //размер окна
        setSize(285, 180);

        //обработчик для кнопки
        buttonAuth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Работает!");
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

    public static void main(String[] args) {
        JFrame frame = new loginForm("Login");
        frame.setVisible(true);
    }
}
