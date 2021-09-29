package ru.mirea.task5.second;

public class Main
{
    public static void main(String[] args)
    {
        Dog ovharka = new Ovharka("white", "medium");
        System.out.println(ovharka);
        ovharka.Voice();
        Dog chau = new ChauChau("orange", "medium","a little burnt)");
        System.out.println(chau);
        chau.Voice();
    }

}