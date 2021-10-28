package ru.mirea.task16;

import javax.swing.*;

public class userForm extends JFrame{
    private JLabel usernameLabel;
    private JLabel USERINFOLabel;
    private JPanel userPanel;
    private JPanel topPanel;

    public userForm() {
        super();
        setTitle("User Info");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(userPanel);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
