package ru.mirea.task13.simpleList;

import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {

    private E[] values;

    public SimpleArray() { //конструктор
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        try { //проверка на исключения
            E[] temp = values; //указатель на объект памяти
            values = (E[]) new Object[temp.length + 1]; //создание массива большего предыдущего на 1
            System.arraycopy(temp, 0, values, 0, temp.length); //копирование элементов из temp в values
            values[values.length - 1] = e; //присваивание нового элемента в конце нового массива
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try { //проверка на исключения
            E[] temp = values; //указатель на объект памяти
            values = (E[]) new Object[temp.length - 1]; //создание массива меньшего предыдущего на 1

            //копирование предудущего массива с учётом удалённого элемента
            System.arraycopy(temp, 0, values, 0, index);
            int amountElemAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index+1, values, index, amountElemAfterIndex);
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() { //реализация итератора
        return new ArrayIterator<>(values);
    }

    public static void main(String[] args) {
        Simple<String> strings = new SimpleArray<>();
        //обавление элементов в массив
        strings.add("first");
        strings.add("second");
        strings.add("third");
        //вывод размера массива
        System.out.println(strings.size());
        System.out.println();
        //вывод элемента массива
        System.out.println(strings.get(0));
        System.out.println();
        //замена элемента массива
        System.out.println(strings.get(2));
        strings.update(2, "newObject");
        System.out.println(strings.get(2));
        System.out.println();
        //удаление элемента массива
        System.out.println(strings.get(1));
        strings.delete(1);
        System.out.println(strings.get(1));


        System.out.println();
        System.out.print(strings);
    }
}
