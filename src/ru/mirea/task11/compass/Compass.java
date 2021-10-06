package ru.mirea.task11.compass;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Compass {
    private JPanel panelMain;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel centerPanerl;
    private JPanel northPanel;
    private JPanel southPanel;

    public Compass() {

        leftPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("WEST");
                JOptionPane.showMessageDialog(null, "WEST");
            }
        });
        rightPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                System.out.print("EAST");
                JOptionPane.showMessageDialog(null, "EAST");
            }
        });
        centerPanerl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("CENTER");
                JOptionPane.showMessageDialog(null, "CENTER");
            }
        });
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("NORTH");
                JOptionPane.showMessageDialog(null, "NORTH");
            }
        });
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.print("SOUTH");
                JOptionPane.showMessageDialog(null, "SOUTH");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Compass");
        frame.setContentPane(new Compass().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
