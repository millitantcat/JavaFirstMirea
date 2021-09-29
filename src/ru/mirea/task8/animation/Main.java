package ru.mirea.task8.animation;

import javax.swing.*;

public class Main extends Animation{
    public static void main(String[] args) {
        new Animation();
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-0.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-1.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-2.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-3.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-4.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-5.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-6.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-7.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-8.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-9.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-10.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-11.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-12.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-13.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-14.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-15.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-16.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-17.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-18.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-19.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-20.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-21.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-22.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-23.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-24.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-25.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-26.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-27.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-28.png").getImage());
        framlist.add(new ImageIcon("src/ru/mirea/task8/animation/gif/mai sakurajima uploaded by erikat on We Heart It-29.png").getImage());
        Animation animImg = new Animation();
        while (true) {
            for (int i = 0; i < 29; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(38);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}