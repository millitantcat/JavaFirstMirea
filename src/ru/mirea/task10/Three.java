package ru.mirea.task10;

import java.io.IOException;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b)
            for (int i = a; i <= b; i++)
                System.out.print(i + " ");
        else
            for (int i = a; i >= b; i--)
                System.out.print(i + " ");
    }
}