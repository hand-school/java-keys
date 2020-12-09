package com.handtruth.lessons.lesson8.task1;

/**
 * Необходимо реализовать интерфейс CustomStack
 *
 * @param <E> - параметризация
 * @see java.util.Stack
 * @see java.util.ArrayDeque
 * @see java.util.LinkedList
 */
public interface CustomStack<E> {

    /**
     * Добавление элемента в стек
     *
     * @return Добавленный элемент
     */
    E push(E item);

    /**
     * Возвращает последний элемент с последующим удалением
     *
     * @return последний элемент
     */
    E pop();

    /**
     * Возвращает последний элемент без удаления
     *
     * @return последний элемент
     */
    E peek();

    /**
     * Пустой ли стек
     *
     * @return true или false
     */
    boolean isEmpty();

    /**
     * Ищет заданный элемент в стеке, возвращая количество операций pop(),
     * которые требуются для того чтобы перевести искомый элемент в вершину стека.
     * Если заданный элемент в стеке отсутствует, этот метод возвращает -1.
     *
     * @param o - объект поиска
     * @return количество операций pop()
     */
    int search(Object o);

}
