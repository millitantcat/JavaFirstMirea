package ru.mirea.task16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class registeredForm extends JFrame {

    private JPanel regPanel;
    private JTextField loginField1;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton Registration;
    private JButton backButton;
    private JButton regButton;
    private JLabel nameLabel;
    private JLabel passwordLabel;
    private JLabel rePasswordLabel;
    private JLabel enterYourBDLabel;
    private JCheckBox showPasswordCheckBox;
    private JTextField nameField1;

    //проверка на уже существующий аккаунт
    public  boolean isUsernameExist(String un) {
        boolean uExist = false;
        Connection con = myConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = con.prepareStatement("SELECT * FROM `user` WHERE `login` = ?");
            ps.setString(1, loginField1.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                uExist = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return uExist;
    }

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

        //кнопка регистрации
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection con = myConnection.getConnection();
                PreparedStatement ps;

                try{
                    ps = con.prepareStatement("INSERT INTO `user`(`login`, `pass`, `name`) VALUES (?,?,?)");
                    ps.setString(1, loginField1.getText());
                    ps.setString(2, String.valueOf(passwordField1.getPassword()));
                    ps.setString(3, nameField1.getText());

                    if (isUsernameExist(loginField1.getText())) {
                        JOptionPane.showMessageDialog(null, "Username Already Exists");
                    } else {
                        if (ps.executeUpdate() != 0){
                            JOptionPane.showMessageDialog(null, "Account Created!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Something Wrong :c");
                        }
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(registeredForm.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }
}
