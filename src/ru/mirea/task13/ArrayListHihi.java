package ru.mirea.task13;

import java.util.Arrays;
import java.util.*;

public class ArrayListHihi {

    public static void main(String[] args) {
        //инициализация массива
        ArrayList <String> deliveryCities = new ArrayList<>();

        deliveryCities.add("Chicago");
        deliveryCities.add("New York");
        deliveryCities.add("Toronto");
        deliveryCities.add("Paris");

        //вывод размера массива
        System.out.println(deliveryCities.size());
        //вывод массива
        System.out.print(deliveryCities + " ");
        System.out.println();
        //добавление нового элемента
        deliveryCities.add(4, "Moscow");
        System.out.print(deliveryCities + " ");
        System.out.println();
        //вывод конкретного элемента
        System.out.println(deliveryCities.get(2));
        //вывод индекса элементов
        System.out.print(deliveryCities.indexOf("New York") + " ");
        System.out.print(deliveryCities.indexOf("Paris"));
        System.out.println();
        //замена элемента
        deliveryCities.set(2, "Berlin");
        System.out.print(deliveryCities + " ");
        System.out.println();
        //удаление объекта
        deliveryCities.remove(3);
        System.out.print(deliveryCities + " ");
        System.out.println();
    }
}
