package ru.mirea.task16;

import javax.swing.*;

public class userForm extends JFrame{
    private JLabel usernameLabel;
    private JLabel USERINFOLabel;
    private JPanel userPanel;
    private JPanel topPanel;
    private JPanel infoPanel;
    private JTextField phoneField;
    private JTextField idField;
    private JTextField nameField;
    private JTextArea adressArea;
    private JLabel emailLabel;
    private JLabel phoneLabel;
    private JLabel IDLabel;
    private JLabel nameLabel;
    private JLabel adressLabel;
    private JTextField checkField;
    private JTextField countField;
    private JLabel checkLabel;
    private JLabel countLabel;
    private JComboBox emailBox;

    public userForm() {
        super();
        setTitle("User Info");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(userPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        setSize(750, 500);
    }

    public static void main(String[] args) {
        userForm form = new userForm();
        form.setVisible(true);
    }
}
