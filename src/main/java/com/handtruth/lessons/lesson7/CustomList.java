package com.handtruth.lessons.lesson7;

/**
 *
 * @param <T> тип данных списка
 * @see java.util.ArrayList
 * @see java.util.LinkedList
 */
public interface CustomList<T> {
    /**
     * Получение размера списка
     *
     * @return размер списка
     */
    int size();

    /**
     * Проверка наличия элемента в списке
     *
     * @param element проверяемый элемент
     * @return true - если элемент есть в списке, иначе false
     */
    boolean contains(T element);

    /**
     * Метод доавления элемента в список
     *
     * @param element - элемент, который хотим добавить
     */
    void add(T element);

    /**
     * Метод доавления элемента в список по указанному индексу
     *
     * @param element - элемент, который хотим добавить
     * @param index  - индекс, куда хотим вставить элемент
     */
    void add(int index, T element);

    /**
     * Получение элемента по индексу
     *
     * @param index - индекс элемента
     * @return значение по индексу
     */
    T get(int index);

    /**
     * Изменение элемента списка
     *
     * @param index      - индекс элемента
     * @param newElement - новый элемент
     * @return страый элемент или null, если до этого ничего не стояло по индексу
     */
    T set(int index, T newElement);

    /**
     * Удаление элемента из списка
     *
     * @param index - индекс удаляемого элемента
     * @return true если элемент удален, иначе false
     */
    boolean remove(int index);
}
