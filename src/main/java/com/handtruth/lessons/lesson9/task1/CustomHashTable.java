package com.handtruth.lessons.lesson9.task1;


/**
 * Hard
 * <p>
 * Перед выполнением необходимо ознакомиться с Java Generic!
 * Вам необходимо реализовать все методы, перечисленные в интерфесе. Создайте свой класс
 * с любым именем и "воплотить" указанные методы.
 * Также перед выполнением необходимо ознакомиться с методами обработок коллизий в хэш-таблицах.
 * Реализовать любой метод борьбы с коллизиями.
 * Не забудьте переопределить методы equals и hashcode
 * В классе тестов к данному заданию необходимо в теле функции с именем setUp
 * написать в указанное место имя вашего класса!
 * Примечание: для удобства разрешено использовать класс Node.
 *
 * @param <K> ключ
 * @param <V> знаение
 */
public interface CustomHashTable<K, V> {
    /**
     * Trivial
     * Метод возвращает значение по ключу
     *
     * @param key - ключ
     * @return найденное значение. Если ключа не существует, вернуть null
     */
    V get(K key);

    /**
     * Trivial
     * <p>
     * Проверка на присутствие ключа в структуре данных
     *
     * @param key - ключ
     * @return true, если ключ сущесвтует, иначе false
     */
    boolean containsKey(K key);

    /**
     * Trivial
     * <p>
     * Проверка на присутствие значения в структуре данных
     *
     * @param value - значение
     * @return true, если значение сущесвтует, иначе false
     */
    boolean containsValue(V value);

    /**
     * Medium
     * <p>
     * Метод добавления ключ и значения в таблицу
     *
     * @param key   - ключ
     * @param value - значение
     * @return value, если операция прошла успешна, иначе вернуть null
     */
    V put(K key, V value);

    /**
     * Medium
     * <p>
     * Удаление элемента из структуры
     *
     * @param key - ключ
     * @return значение по заданному ключу. Если тип данных ключа не является K, бросить IllegalArgumentException().
     * В случае, если такого ключа нет в структуре - вернуть null
     */
    V remove(Object key);

    /**
     * Trivial
     * <p>
     * Возвращает размер структуры
     *
     * @return размер структуры
     */
    int size();

    class Node<K, V> {
        final int hash;
        K key;
        V value;
        Node<K,V> next;

        public Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node<?, ?> node = (Node<?, ?>) o;
            return key.equals(node.key) &&
                    value.equals(node.value);
        }

        @Override
        public int hashCode() {
            int res = 17;
            res = 31 * res + key.hashCode();
            return res;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }
}
