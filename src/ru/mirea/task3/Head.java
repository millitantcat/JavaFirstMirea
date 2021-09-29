package ru.mirea.task3;
import java.math.*;

public class Head
{
    private int HeadType;

    public Head(int HeadType)
    {
        this.HeadType = HeadType;
    }

    public Head()
    {
        this.HeadType = 2;
    }

    public void Wink()
    {
        if (HeadType == 2)
        {
            int i = (int) (0 + Math.random()*2);
            switch (i)
            {
                case 0:
                    System.out.println("На лице человека выражено счастье");
                    break;
                case 1:
                    System.out.println("На лице человека выражено отчаяние");
                    break;
            }
        }
        else if (HeadType == 1)
            System.out.println("Кажется это безобидное существо");
        else if (HeadType == 0)
            System.out.println("Надеюсь у тьмы нету глаз...");
        else if (HeadType > 2)
            System.out.println("Впереди какое-то существо...не стоит подходить к нему ближе");
    }
}