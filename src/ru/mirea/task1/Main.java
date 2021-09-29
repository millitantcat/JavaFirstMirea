package ru.mirea.task1;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main (String[] args){
        int sumarr_1 = 0;
        int sumarr_2 = 0;
        int sumarr_3 = 0;
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < 10; i++)
            sumarr_1 += arr[i];

        int j = 0;
        while (j < 10) {
            sumarr_2 += arr[j];
            j++;
        }

        int k = 9;
        do {
            sumarr_3 += arr[k];
            k--;
        } while (k >= 0);

        System.out.println(sumarr_1);
        System.out.println(sumarr_2);
        System.out.println(sumarr_3);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (int i=0; i< name.length(); i++)
            System.out.print(name.charAt(i));

        System.out.println();
        for (int i = 1; i < 11; i++)
            System.out.println(1./i);

        //Создаем массив случайных чисел
        int array[] = new int[10];
        for(int i = 0; i <  array.length; i++) {
            array[i] =  (int)(Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        //Сортируем массив
        Arrays.sort(array);
        //Выводим отсортированный массив на консоль.
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println();

        System.out.println(getFactorial(5));
    }
}