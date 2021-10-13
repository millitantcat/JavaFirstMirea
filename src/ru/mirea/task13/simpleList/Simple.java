package ru.mirea.task13.simpleList;

public interface Simple<E> extends Iterable<E>{
    boolean add(E e); //добавление элемента
    void delete(int index); //кдаление элемента по индексу
    E get(int index); //получение элемента по индексу
    int size(); //получение размера
    void update(int index, E e); //оюновление значения по индексу
}
